
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Yeu cau 3: tao doi tuong
        Sach s1 = new Sach("S001", "Lap trinh Java", "Nguyen Van A", 2023, 10);
        System.out.println("=== Doi tuong s1 ===");
        s1.hienThiThongTin();

        // Yeu cau 4: ArrayList
        ArrayList<Sach> danhSach = new ArrayList<>();
        danhSach.add(s1);
        danhSach.add(new Sach("S002", "Cau truc du lieu", "Tran Thi B", 2022, 5));

        int chon;
        do {
            System.out.println("\n===== QUAN LY SACH =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Xoa sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Ma sach: ");
                    String ma = sc.nextLine();
                    System.out.print("Tieu de: ");
                    String td = sc.nextLine();
                    System.out.print("Tac gia: ");
                    String tg = sc.nextLine();
                    System.out.print("Nam xuat ban: ");
                    int nam = sc.nextInt();
                    System.out.print("So luong: ");
                    int sl = sc.nextInt();
                    sc.nextLine();
                    danhSach.add(new Sach(ma, td, tg, nam, sl));
                    System.out.println("Da them.");
                    break;
                case 2:
                    if (danhSach.isEmpty()) {
                        System.out.println("Danh sach rong.");
                    } else {
                        for (Sach s : danhSach) {
                            s.hienThiThongTin();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhap ma can tim: ");
                    String tim = sc.nextLine();
                    boolean thay = false;
                    for (Sach s : danhSach) {
                        if (s.getMaSach().equalsIgnoreCase(tim)) {
                            s.hienThiThongTin();
                            thay = true;
                            break;
                        }
                    }
                    if (!thay) System.out.println("Khong tim thay.");
                    break;
                case 4:
                    System.out.print("Nhap ma can xoa: ");
                    String xoa = sc.nextLine();
                    boolean daXoa = danhSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(xoa));
                    System.out.println(daXoa ? "Da xoa." : "Khong tim thay.");
                    break;
                case 0:
                    System.out.println("Tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);

        sc.close();
    }
}
