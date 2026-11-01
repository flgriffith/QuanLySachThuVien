import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap thong tin sach
        System.out.print("Nhap ma sach: ");
        String maSach = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        String tenSach = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = sc.nextInt();

        System.out.print("Nhap don gia: ");
        double donGia = sc.nextDouble();

        System.out.print("Nhap so luong: ");
        int soLuong = sc.nextInt();

        // Bai 1: Kiem tra hop le
        int namHienTai = java.time.Year.now().getValue();
        boolean hopLe = true;

        if (donGia <= 0) {
            System.out.println("Loi: Don gia phai > 0");
            hopLe = false;
        }
        if (soLuong < 0) {
            System.out.println("Loi: So luong phai >= 0");
            hopLe = false;
        }
        if (namXuatBan < 1900 || namXuatBan > namHienTai) {
            System.out.println("Loi: Nam xuat ban phai tu 1900 den " + namHienTai);
            hopLe = false;
        }

        if (!hopLe) {
            System.out.println("Sach khong hop le. Ket thuc chuong trinh.");
            sc.close();
            return;
        }
        System.out.println("Sach hop le.");

        // Hien thi lai thong tin
        System.out.println("\n===== THONG TIN SACH =====");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);

        // Tinh tien (tu tuan 3)
        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTienNhap = thanhTien + phiVanChuyen;
        System.out.println("Thanh tien: " + thanhTien);
        System.out.println("Phi van chuyen (5%): " + phiVanChuyen);
        System.out.println("Tong tien nhap: " + tongTienNhap);

        // Bai 2: Phan loai gia
        String loaiGia;
        if (donGia < 50000) {
            loaiGia = "Sach gia thap";
        } else if (donGia <= 100000) {
            loaiGia = "Sach gia trung binh";
        } else if (donGia <= 200000) {
            loaiGia = "Sach gia cao";
        } else {
            loaiGia = "Sach gia dac biet";
        }
        System.out.println("Phan loai gia: " + loaiGia);

        // Bai 3: Phan loai ton kho
        String tonKho;
        if (soLuong == 0) {
            tonKho = "Het sach";
        } else if (soLuong <= 5) {
            tonKho = "Sap het";
        } else if (soLuong <= 20) {
            tonKho = "Con it";
        } else {
            tonKho = "Con nhieu";
        }
        System.out.println("Ton kho: " + tonKho);

        // Bai 4: Chon loai sach bang switch
        System.out.println("\nChon loai sach:");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Nhap lua chon (1-4): ");
        int chon = sc.nextInt();

        String loaiSach;
        switch (chon) {
            case 1:
                loaiSach = "Sach giao khoa";
                break;
            case 2:
                loaiSach = "Sach tham khao";
                break;
            case 3:
                loaiSach = "Sach chuyen nganh";
                break;
            case 4:
                loaiSach = "Sach khac";
                break;
            default:
                loaiSach = "Lua chon khong hop le";
        }
        System.out.println("Loai sach: " + loaiSach);

        sc.close();
    }
}