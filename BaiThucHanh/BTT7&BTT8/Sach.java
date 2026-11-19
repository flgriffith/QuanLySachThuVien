import java.time.Year;

public class Sach {

    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

  
    public Sach() {
    }


    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan);
        setSoLuong(soLuong);
    }


    public String getMaSach() { return maSach; }
    public String getTieuDe() { return tieuDe; }
    public String getTacGia() { return tacGia; }
    public int getNamXuatBan() { return namXuatBan; }
    public int getSoLuong() { return soLuong; }


    public void setMaSach(String maSach) { this.maSach = maSach; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }


    public void setNamXuatBan(int namXuatBan) {
        int currentYear = Year.now().getValue();
        if (namXuatBan > 0 && namXuatBan <= currentYear) 
        {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Nam xuat ban khong hop le (phai tu 1 den " + currentYear + "). Giu nguyen gia tri cu.");
        }
    }

    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) 
        {
            this.soLuong = soLuong;
        } 
        else 
        {
            System.out.println("So luong khong duoc am. Giu nguyen gia tri cu.");
        }
    }

    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach
                + " | Tieu de: " + tieuDe
                + " | Tac gia: " + tacGia
                + " | Nam XB: " + namXuatBan
                + " | So luong: " + soLuong);
    }
}