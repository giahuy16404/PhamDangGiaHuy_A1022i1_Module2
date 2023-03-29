package model;

public abstract class TaiKhoanNganHang {
    private  int idTaiKhoan;
    private String maTaiKhoan;
    private String tenChu;
    private String ngayTao;

    public TaiKhoanNganHang(int idTaiKhoan, String maTaiKhoan, String tenChu, String ngayTao) {
        this.idTaiKhoan = idTaiKhoan;
        this.maTaiKhoan = maTaiKhoan;
        this.tenChu = tenChu;
        this.ngayTao = ngayTao;
    }

    public TaiKhoanNganHang() {
    }

    public int getIdTaiKhoan() {
        return idTaiKhoan;
    }

    public void setIdTaiKhoan(int idTaiKhoan) {
        this.idTaiKhoan = idTaiKhoan;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getTenChu() {
        return tenChu;
    }

    public void setTenChu(String tenChu) {
        this.tenChu = tenChu;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }
    public abstract String show();

    @Override
    public String toString() {
        return "TaiKhoanNganHang{" +
                "idTaiKhoan='" + idTaiKhoan + '\'' +
                ", maTaiKhoan='" + maTaiKhoan + '\'' +
                ", tenChu='" + tenChu + '\'' +
                ", ngayTao='" + ngayTao + '\'' +
                '}';
    }
}
