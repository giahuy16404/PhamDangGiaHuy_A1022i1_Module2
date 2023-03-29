package controller;

import model.TaiKhoanThanhToan;
import model.TaiKhoanTietKiem;
import service.TaiKhoanTKService;
import service.TaiKhoanTtService;
import uti.Regex;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void show() throws IOException {
        TaiKhoanTtService taiKhoanTtService = new TaiKhoanTtService();
        TaiKhoanTKService taiKhoanTkService = new TaiKhoanTKService();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Tai khoan tiet kiem: ");
            System.out.println("2.Tai khoan thanh toan: ");
            System.out.println("3.thoat");
            int select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    boolean flagCase1 = true;
                    while (flagCase1) {
                        System.out.println("1.Them tai khoan tiet kiem.");
                        System.out.println("2.xoa.");
                        System.out.println("3.hien thi.");
                        System.out.println("4.tim kim.");
                        System.out.println("5.thoat.");
                        int selectCase1 = Integer.parseInt(sc.nextLine());
                        switch (selectCase1) {
                            case 1:
//                                System.out.print("Nhap vao id tai khoan: ");
                                int idTk = 1;

                                System.out.print("Nhap vao ma tai khoan: ");
                                String maTk = sc.nextLine();
                                boolean checkMatk = maTk.matches(Regex.REGEX_TK);
                                while (!checkMatk){
                                    System.out.println("sai định dạng mã, mời nập lại:");
                                    maTk = sc.nextLine();
                                    checkMatk = maTk.matches(Regex.REGEX_TK);
                                }

                                System.out.print("Nhap vao ten chu tai khoan: ");
                                String tenChuTk = sc.nextLine();

                                System.out.print("Nhap vao ngay tao tai khoan: ");
                                String ngayTaoTk = sc.nextLine();

                                System.out.print("Nhap vao so tien gui: ");
                                int soTienGui = Integer.parseInt(sc.nextLine());

                                System.out.print("Nhap vao ngay gui: ");
                                String ngayGui = sc.nextLine();

                                System.out.print("Nhap vao lai xuat: ");
                                int laiXuat = Integer.parseInt(sc.nextLine());

                                System.out.print("Nhap vao ki hang: ");
                                int kiHang = Integer.parseInt(sc.nextLine());
                                taiKhoanTkService.add(new TaiKhoanTietKiem(idTk,maTk,tenChuTk,ngayTaoTk,soTienGui,ngayGui,laiXuat,kiHang));
                                break;

                            case 2:
                                System.out.println("Nhap vao ma muon xoa");
                                String ma = sc.nextLine();
                                boolean checkXoa = ma.matches(Regex.REGEX_TK);
                                while (!checkXoa){
                                    System.out.println("sai định dạng mã, mời nập lại:");
                                    ma = sc.nextLine();
                                    checkXoa = ma.matches(Regex.REGEX_TK);
                                }
                                taiKhoanTkService.remove(ma);
                                break;

                            case 3:
                                taiKhoanTkService.display();
                                break;

                            case 4:
                                System.out.println("Nhap vao ma muon tim kiem");
                                String timMa = sc.nextLine();
                                boolean checkMa = timMa.matches(Regex.REGEX_TK);
                                while (!checkMa){
                                    System.out.println("sai định dạng mã, mời nập lại:");
                                    timMa = sc.nextLine();
                                    checkMa = timMa.matches(Regex.REGEX_TK);
                                }
                                taiKhoanTkService.timKiem(timMa);
                                break;

                            case 5:
                                flagCase1 = false;
                                break;

                        }
                    }
                    break;
                case 2:
                    boolean flagCase2 = true;
                    while (flagCase2) {
                        System.out.println("1.Them tai khoan Thanh toan.");
                        System.out.println("2.xoa.");
                        System.out.println("3.hien thi.");
                        System.out.println("4.tim kim.");
                        System.out.println("5.thoat.");
                        int selectCase1 = Integer.parseInt(sc.nextLine());
                        switch (selectCase1) {
                            case 1:
//                                System.out.print("Nhap vao id tai khoan: ");
                                int idTT = 1;

                                System.out.print("Nhap vao ma tai khoan: ");
                                String maTT = sc.nextLine();
                                boolean checkMatt = maTT.matches(Regex.REGEX_TT);
                                while (!checkMatt){
                                    System.out.println("sai định dạng mã, mời nập lại:");
                                    maTT = sc.nextLine();
                                    checkMatt = maTT.matches(Regex.REGEX_TT);
                                }

                                System.out.print("Nhap vao ten chu tai khoan: ");
                                String tenChuTT = sc.nextLine();

                                System.out.print("Nhap vao ngay tao tai khoan: ");
                                String ngayTaoTT = sc.nextLine();

                                System.out.print("Nhap vao so the: ");
                                String soTheTT = sc.nextLine();

                                System.out.print("Nhap vao so tien trong TK: ");
                                int soTienTrongTkTT = Integer.parseInt(sc.nextLine());

                                taiKhoanTtService.add(new TaiKhoanThanhToan(idTT,maTT,tenChuTT,ngayTaoTT,soTheTT,soTienTrongTkTT));
                                break;
                            case 2:
                                System.out.println("Nhap vao ma muon xoa");
                                String ma = sc.nextLine();
                                boolean checkXoa = ma.matches(Regex.REGEX_TT);
                                while (!checkXoa){
                                    System.out.println("sai định dạng mã, mời nập lại:");
                                    ma = sc.nextLine();
                                    checkXoa = ma.matches(Regex.REGEX_TT);
                                }
                                taiKhoanTtService.remove(ma);
                                break;

                            case 3:
                                taiKhoanTtService.display();
                                break;

                            case 4:
                                System.out.println("Nhap vao ma muon tim kiem");
                                String timMa = sc.nextLine();
                                boolean checkMa = timMa.matches(Regex.REGEX_TT);
                                while (!checkMa){
                                    System.out.println("sai định dạng mã, mời nập lại:");
                                    timMa = sc.nextLine();
                                    checkMa = timMa.matches(Regex.REGEX_TT);
                                }
                                taiKhoanTtService.timKiem(timMa);
                                break;

                            case 5:
                                flagCase2 = false;
                                break;
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Menu.show();
    }

}
