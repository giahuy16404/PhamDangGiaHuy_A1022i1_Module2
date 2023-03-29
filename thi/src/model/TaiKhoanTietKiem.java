package model;

public class TaiKhoanTietKiem  extends  TaiKhoanNganHang{
    private int soTienGui;
    private String ngayGui;
    private int laiXuat;
    private int kiHang;




    public TaiKhoanTietKiem(int idTaiKhoan, String maTaiKhoan, String tenChu,
                            String ngayTao, int soTienGui, String ngayGui, int laiXuat, int kiHang) {
        super(idTaiKhoan, maTaiKhoan, tenChu, ngayTao);
        this.soTienGui = soTienGui;
        this.ngayGui = ngayGui;
        this.laiXuat = laiXuat;
        this.kiHang = kiHang;
    }

    public TaiKhoanTietKiem(int soTienGui, String ngayGui, int laiXuat, int kiHang) {
        this.soTienGui = soTienGui;
        this.ngayGui = ngayGui;
        this.laiXuat = laiXuat;
        this.kiHang = kiHang;
    }




    public int getSoTienGui() {
        return soTienGui;
    }

    public void setSoTienGui(int soTienGui) {
        this.soTienGui = soTienGui;
    }

    public String getNgayGui() {
        return ngayGui;
    }

    public void setNgayGui(String ngayGui) {
        this.ngayGui = ngayGui;
    }

    public int getLaiXuat() {
        return laiXuat;
    }

    public void setLaiXuat(int laiXuat) {
        this.laiXuat = laiXuat;
    }

    public int getKiHang() {
        return kiHang;
    }

    public void setKiHang(int kiHang) {
        this.kiHang = kiHang;
    }

    @Override
    public String show() {
        return "TaiKhoanTietKiem{" +
                "soTienGui=" + soTienGui +
                ", ngayGui='" + ngayGui + '\'' +
                ", laiXuat=" + laiXuat +
                ", kiHang='" + kiHang + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "TaiKhoanTietKiem{" +
                "soTienGui=" + soTienGui +
                ", ngayGui='" + ngayGui + '\'' +
                ", laiXuat=" + laiXuat +
                ", kiHang='" + kiHang + '\'' +
                '}';
    }


}
