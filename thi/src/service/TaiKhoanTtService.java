package service;

import data.DataNganHang;
import model.TaiKhoanNganHang;
import model.TaiKhoanThanhToan;

import java.io.IOException;
import java.util.List;

public class TaiKhoanTtService implements INganHang{
    @Override
    public void add(Object o) throws IOException {
        List<TaiKhoanNganHang> list = DataNganHang.read();
        for (TaiKhoanNganHang taiKhoanNganHang:list) {
            if (taiKhoanNganHang instanceof TaiKhoanThanhToan){
                ((TaiKhoanThanhToan) o ).setIdTaiKhoan(taiKhoanNganHang.getIdTaiKhoan()+1);
            }
        }
        list.add((TaiKhoanThanhToan) o);
        DataNganHang.write(list);
    }

    @Override
    public void remove(String ma) throws IOException {
        List<TaiKhoanNganHang> list = DataNganHang.read();
        for (TaiKhoanNganHang taiKhoanThanhToan: list) {
            if (taiKhoanThanhToan instanceof TaiKhoanThanhToan && taiKhoanThanhToan.getMaTaiKhoan().equals(ma)){
                list.remove(taiKhoanThanhToan);
                break;
            }
        }
        DataNganHang.write(list);
    }

    @Override
    public void display() throws IOException {
        List<TaiKhoanNganHang> list = DataNganHang.read();
        for (TaiKhoanNganHang taiKhoanThanhToan: list) {
            if (taiKhoanThanhToan instanceof TaiKhoanThanhToan){
                System.out.println(taiKhoanThanhToan.show());
            }
        }
    }

    @Override
    public void timKiem(String ma) throws IOException {
        List<TaiKhoanNganHang> list = DataNganHang.read();
        for (TaiKhoanNganHang taiKhoanThanhToan: list) {
            if (taiKhoanThanhToan instanceof TaiKhoanThanhToan && taiKhoanThanhToan.getMaTaiKhoan().equals(ma)){
                System.out.println(taiKhoanThanhToan.show());
                break;
            }
        }
    }
}
