import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    // BAI 1: Mang int[] soLuong 
    static void bai1() {
        System.out.println("\n===== BAI 1: MANG SO LUONG =====");
        int[] soLuong = new int[5];
        for (int i = 0; i < soLuong.length; i++) {
            System.out.print("Nhap so luong cuon sach " + (i + 1) + ": ");
            soLuong[i] = sc.nextInt();
        }
        sc.nextLine();

        int tong = 0;
        int max = soLuong[0];
        System.out.println("So luong cac cuon sach:");
        for (int i = 0; i < soLuong.length; i++) {
            System.out.println("Sach " + (i + 1) + ": " + soLuong[i]);
            tong += soLuong[i];
            if (soLuong[i] > max) {
                max = soLuong[i];
            }
        }
        System.out.println("Tong so luong: " + tong);
        System.out.println("So luong lon nhat: " + max);
    }

    // BAI 2: ArrayList<String> luu ma sach
    static void bai2() {
        System.out.println("\n===== BAI 2: ARRAYLIST MA SACH =====");
        ArrayList<String> dsMa = new ArrayList<>();
        int chon;
        do {
            System.out.println("\n1. Them ma  2. Hien thi  3. Tim ma  4. Xoa ma  0. Quay lai");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    System.out.print("Nhap ma sach: ");
                    dsMa.add(sc.nextLine());
                    System.out.println("Da them.");
                    break;
                case 2:
                    if (dsMa.isEmpty()) {
                        System.out.println("Danh sach rong.");
                    } else {
                        for (int i = 0; i < dsMa.size(); i++) {
                            System.out.println((i + 1) + ". " + dsMa.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhap ma can tim: ");
                    String tim = sc.nextLine();
                    if (dsMa.contains(tim)) {
                        System.out.println("Tim thay o vi tri " + (dsMa.indexOf(tim) + 1));
                    } else {
                        System.out.println("Khong tim thay.");
                    }
                    break;
                case 4:
                    System.out.print("Nhap ma can xoa: ");
                    String xoa = sc.nextLine();
                    if (dsMa.remove(xoa)) {
                        System.out.println("Da xoa.");
                    } else {
                        System.out.println("Khong tim thay ma de xoa.");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
    }

    //  BAI 3 + 4: ArrayList<String> danhSachSach + menu 
    // Moi phan tu: ma;ten;tacGia;nam;donGia;soLuong
    static ArrayList<String> danhSachSach = new ArrayList<>();

    static String nhapSach() {
        System.out.print("Ma sach: ");
        String ma = sc.nextLine();
        System.out.print("Ten sach: ");
        String ten = sc.nextLine();
        System.out.print("Tac gia: ");
        String tg = sc.nextLine();
        System.out.print("Nam xuat ban: ");
        int nam = sc.nextInt();
        System.out.print("Don gia: ");
        double gia = sc.nextDouble();
        System.out.print("So luong: ");
        int sl = sc.nextInt();
        sc.nextLine();
        return ma + ";" + ten + ";" + tg + ";" + nam + ";" + gia + ";" + sl;
    }

    static void inSach(String s) {
        String[] p = s.split(";");
        System.out.println("Ma: " + p[0] + " | Ten: " + p[1] + " | Tac gia: " + p[2]
                + " | Nam: " + p[3] + " | Gia: " + p[4] + " | SL: " + p[5]);
    }

    static int timViTri(String ma) {
        for (int i = 0; i < danhSachSach.size(); i++) {
            String[] p = danhSachSach.get(i).split(";");
            if (p[0].equalsIgnoreCase(ma)) {
                return i;
            }
        }
        return -1;
    }

    static void menu() {
        int chon;
        do {
            System.out.println("\n===== QUAN LY SACH =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    danhSachSach.add(nhapSach());
                    System.out.println("Da them sach.");
                    break;
                case 2:
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sach rong.");
                    } else {
                        for (int i = 0; i < danhSachSach.size(); i++) {
                            System.out.print((i + 1) + ". ");
                            inSach(danhSachSach.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhap ma can tim: ");
                    int vt = timViTri(sc.nextLine());
                    if (vt == -1) {
                        System.out.println("Khong tim thay.");
                    } else {
                        inSach(danhSachSach.get(vt));
                    }
                    break;
                case 4:
                    System.out.print("Nhap ma can xoa: ");
                    int vx = timViTri(sc.nextLine());
                    if (vx == -1) {
                        System.out.println("Khong tim thay.");
                    } else {
                        danhSachSach.remove(vx);
                        System.out.println("Da xoa.");
                    }
                    break;
                case 5:
                    System.out.print("Nhap ma sach can sua: ");
                    int vs = timViTri(sc.nextLine());
                    if (vs == -1) {
                        System.out.println("Khong tim thay.");
                    } else {
                        System.out.println("Nhap thong tin moi:");
                        danhSachSach.set(vs, nhapSach());
                        System.out.println("Da sua.");
                    }
                    break;
                case 6:
                    int tongSL = 0;
                    for (String s : danhSachSach) {
                        tongSL += Integer.parseInt(s.split(";")[5]);
                    }
                    System.out.println("Tong so luong: " + tongSL);
                    break;
                case 7:
                    double tongGT = 0;
                    for (String s : danhSachSach) {
                        String[] p = s.split(";");
                        tongGT += Double.parseDouble(p[4]) * Integer.parseInt(p[5]);
                    }
                    System.out.printf("Tong gia tri: %.0f%n", tongGT);
                    break;
                case 8:
                    System.out.println("Tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 8);
    }

    public static void main(String[] args) {
        bai1();
        //bai2();
       // menu();
        sc.close();
    }
}