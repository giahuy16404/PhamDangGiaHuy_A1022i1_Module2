package model;

public class TaiKhoanThanhToan extends TaiKhoanNganHang {
    private String soThe;
    private int soTienTrongTaiKhoan;

    public TaiKhoanThanhToan(int idTaiKhoan, String maTaiKhoan, String tenChu, String ngayTao, String soThe, int soTienTrongTaiKhoan) {
        super(idTaiKhoan, maTaiKhoan, tenChu, ngayTao);
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public TaiKhoanThanhToan(String soThe, int soTienTrongTaiKhoan) {
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public int getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void setSoTienTrongTaiKhoan(int soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    @Override
    public String toString() {
        return "TaiKhoanThanhToan{" +
                "soThe='" + soThe + '\'' +
                ", soTienTrongTaiKhoan=" + soTienTrongTaiKhoan +
                '}';
    }

    @Override
    public String show() {
        return "TaiKhoanThanhToan{" +
                "soThe='" + soThe + '\'' +
                ", soTienTrongTaiKhoan=" + soTienTrongTaiKhoan +
                '}';
    }
}
