package data;

import model.TaiKhoanNganHang;
import model.TaiKhoanThanhToan;
import model.TaiKhoanTietKiem;
import uti.Regex;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataNganHang {
    private static final String FILE_NganHang = "D:\\CODEGYM\\Module2\\thi\\src\\data\\bank_accoutns.csv";

    public static List<TaiKhoanNganHang> read() throws IOException {
        FileReader fileReader = new FileReader(FILE_NganHang);
        BufferedReader tK = new BufferedReader(fileReader);
        List<TaiKhoanNganHang> list = new ArrayList<>();
        String line;
        String[] temp;
        TaiKhoanNganHang taiKhoanNganHang;
        while ((line = tK.readLine()) != null) {
            temp = line.split(",");

            if (temp[1].matches(Regex.REGEX_TK)) {

                int id = Integer.parseInt(temp[0]);
                String maTk = temp[1];
                String tenChu = temp[2];
                String ngayTao = temp[3];
                int soTienGui = Integer.parseInt(temp[4]);
                String ngayGui = temp[5];
                int laiXuat = Integer.parseInt(temp[6]);
                int kihang = Integer.parseInt(temp[7]);
                taiKhoanNganHang = new TaiKhoanTietKiem(id, maTk, tenChu, ngayTao, soTienGui, ngayGui, laiXuat, kihang);
                list.add(taiKhoanNganHang);

            } else if (temp[1].matches(Regex.REGEX_TT)) {

                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String maTk = temp[1];
                String tenChu = temp[2];
                String ngayTao = temp[3];
                String soThe = temp[4];
                int soTienTrongTkTT = Integer.parseInt(temp[5]);
                taiKhoanNganHang = new TaiKhoanThanhToan(id, maTk, tenChu, ngayTao, soThe, soTienTrongTkTT);
                list.add(taiKhoanNganHang);
            }
        }
        tK.close();
        return list;
    }

    public static void write(List<TaiKhoanNganHang> list) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_NganHang);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (TaiKhoanNganHang tt : list) {
            if (tt instanceof TaiKhoanThanhToan) {

                bufferedWriter.write(tt.getIdTaiKhoan() + "," + tt.getMaTaiKhoan() + "," +
                        tt.getTenChu() + "," + tt.getNgayTao() + "," + ((TaiKhoanThanhToan) tt).getSoThe() + "," +
                        ((TaiKhoanThanhToan) tt).getSoTienTrongTaiKhoan() + "\n");

            } else if (tt instanceof TaiKhoanTietKiem) {
                bufferedWriter.write(tt.getIdTaiKhoan() + "," + tt.getMaTaiKhoan() + ","
                        + tt.getTenChu() + "," + tt.getNgayTao() + "," + ((TaiKhoanTietKiem) tt).getSoTienGui() + "," +
                        ((TaiKhoanTietKiem) tt).getNgayGui() + "," + ((TaiKhoanTietKiem) tt).getLaiXuat() +
                        "," + ((TaiKhoanTietKiem) tt).getKiHang() + "\n");
            }
        }

        bufferedWriter.close();
    }

}
