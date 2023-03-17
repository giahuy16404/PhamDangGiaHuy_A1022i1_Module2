package furama_test.controllers.employee_view;

import java.util.Scanner;

public class AddEmployee {
    public static void addEmployee(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhập mã nhân viên:");
            String codeEmployees = sc.nextLine();

            System.out.print("Nhập họ và tên: ");
            String nameEmployees = sc.nextLine();

            System.out.print("Nhập ngày tháng năm sinh dd/MM/yyyy: ");
            String birthDayEmployees = sc.nextLine();

            System.out.print("Nhập giới tính: ");
            String genderEmployees = sc.nextLine();

            System.out.print("Nhập số căn cước công dân: ");
            int idCCEmployees = Integer.parseInt(sc.nextLine());

            System.out.print("Nhập số điện thoại: ");
            int phoneNumberEmployees = Integer.parseInt(sc.nextLine());

            System.out.print("Nhập địa chỉ nhà: ");
            String addressEmployees = sc.nextLine();

            System.out.print("Nhập địa chỉ email: ");
            String emailEmployees = sc.nextLine();

            System.out.print("Nhập trình độ học vấn: ");
            String levelEmployees = sc.nextLine();

            System.out.print("Nhập vị trí: ");
            String locationEmployees = sc.nextLine();

            System.out.print("Nhập lương nhân viên: ");
            double wage = Double.parseDouble(sc.nextLine());
            System.out.println(" ---------------- ");

        } catch (NumberFormatException e) {
            System.out.println("Đã nhập sai định dạng số. Vui lòng nhập lại.");
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }
}
