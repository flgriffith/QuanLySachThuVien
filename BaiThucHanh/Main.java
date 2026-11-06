import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bai 1: Nhap n sach bang vong lap
        int n;
        do {
            System.out.print("Nhap so luong sach (n > 0): ");
            n = sc.nextInt();
        } while (n <= 0);
        sc.nextLine(); 

        String[] maSach = new String[n];
        String[] tenSach = new String[n];
        String[] tacGia = new String[n];
        int[] namXuatBan = new int[n];
        double[] donGia = new double[n];
        int[] soLuong = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Nhap sach thu " + (i + 1) + " ---");
            System.out.print("Ma sach: ");
            maSach[i] = sc.nextLine();
            System.out.print("Ten sach: ");
            tenSach[i] = sc.nextLine();
            System.out.print("Tac gia: ");
            tacGia[i] = sc.nextLine();
            System.out.print("Nam xuat ban: ");
            namXuatBan[i] = sc.nextInt();
            System.out.print("Don gia: ");
            donGia[i] = sc.nextDouble();
            System.out.print("So luong: ");
            soLuong[i] = sc.nextInt();
            sc.nextLine();
        }

        // Bai 3: Menu lap den khi chon Thoat
        int chon;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Hien thi danh sach sach");
            System.out.println("2. Tinh tong so luong va tong gia tri");
            System.out.println("3. Tim sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.println("\n--- DANH SACH SACH ---");
                    for (int i = 0; i < n; i++) {
                        System.out.println((i + 1) + ". " + maSach[i] + " | " + tenSach[i]
                                + " | " + tacGia[i] + " | " + namXuatBan[i]
                                + " | " + donGia[i] + " | SL: " + soLuong[i]);
                    }
                    break;

                case 2:
                    // Bai 2: Tong so luong va tong gia tri
                    int tongSoLuong = 0;
                    double tongGiaTri = 0;
                    for (int i = 0; i < n; i++) {
                        tongSoLuong += soLuong[i];
                        tongGiaTri += donGia[i] * soLuong[i];
                    }
                    System.out.println("Tong so luong: " + tongSoLuong);
                    System.out.printf("Tong gia tri: %.0f%n", tongGiaTri);
                    break;

                case 3:
                    // Bai 4: Tim sach theo ma
                    System.out.print("Nhap ma sach can tim: ");
                    String ma = sc.nextLine();
                    boolean timThay = false;
                    for (int i = 0; i < n; i++) {
                        if (maSach[i].equalsIgnoreCase(ma)) {
                            System.out.println("Tim thay: " + tenSach[i] + " | " + tacGia[i]
                                    + " | " + namXuatBan[i] + " | " + donGia[i]
                                    + " | SL: " + soLuong[i]);
                            timThay = true;
                            break;
                        }
                    }
                    if (!timThay) {
                        System.out.println("Khong tim thay sach co ma: " + ma);
                    }
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