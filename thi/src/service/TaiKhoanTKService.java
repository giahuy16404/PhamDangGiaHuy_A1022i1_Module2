package service;

import data.DataNganHang;
import model.TaiKhoanNganHang;
import model.TaiKhoanTietKiem;

import java.io.IOException;
import java.util.List;

public class TaiKhoanTKService implements INganHang {
    @Override
    public void add(Object o) throws IOException {
        List<TaiKhoanNganHang> list = DataNganHang.read();
        for (TaiKhoanNganHang taiKhoanNganHang:list) {
            if (taiKhoanNganHang instanceof TaiKhoanTietKiem){
                ((TaiKhoanTietKiem) o).setIdTaiKhoan(taiKhoanNganHang.getIdTaiKhoan()+1);
            }
        }
        list.add((TaiKhoanTietKiem) o);
        DataNganHang.write(list);
    }
    @Override
    public void remove(String ma) throws IOException {
        List<TaiKhoanNganHang> list = DataNganHang.read();
        for (TaiKhoanNganHang taiKhoanNganHang: list) {
            if (taiKhoanNganHang instanceof TaiKhoanTietKiem && taiKhoanNganHang.getMaTaiKhoan().equals(ma)){
                list.remove(taiKhoanNganHang);
                break;
            }
        }
        DataNganHang.write(list);
    }

    @Override
    public void display() throws IOException {
        List<TaiKhoanNganHang> list = DataNganHang.read();
        for (TaiKhoanNganHang taiKhoanNganHang : list) {
            if (taiKhoanNganHang instanceof TaiKhoanTietKiem) {
                System.out.println(taiKhoanNganHang);
            }
        }
    }

    @Override
    public void timKiem(String ma) throws IOException {
        List<TaiKhoanNganHang> list = DataNganHang.read();
        for (TaiKhoanNganHang taiKhoanThanhToan: list) {
            if (taiKhoanThanhToan instanceof TaiKhoanTietKiem && taiKhoanThanhToan.getMaTaiKhoan().equals(ma)){
                System.out.println(taiKhoanThanhToan);
                break;
            }
        }
    }
}
