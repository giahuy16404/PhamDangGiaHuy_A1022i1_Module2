package furama_test.controllers.employee_view;

import furama_test.models.Employee;
import furama_test.services.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class EditEmployee {
    public static void editEmployee() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào mã nhân viên cần thay đổi: ");
        String checkID = sc.nextLine();
        boolean check = employeeService.checkId(checkID);
        if (check) {
            System.out.print("Nhập mã nhân viên mới: ");
            String newId = sc.nextLine();
            System.out.print("Nhập tên nhân viên mới: ");
            String newName = sc.nextLine();
            System.out.print("Nhập ngày tháng năm sinh mới: ");
            String newBirthday = sc.nextLine();
            System.out.print("Nhập ngày giới tính mới: ");
            String newGender = sc.nextLine();
            System.out.print("Nhập CCCD mới: ");
            int newCCCD = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập SDT mới: ");
            int newSDT = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập email mới: ");
            String newEmail = sc.nextLine();
            System.out.print("Nhập địa chỉ mới: ");
            String newAdress = sc.nextLine();
            System.out.print("Nhập trình độ học vấn mới: ");
            String newLever = sc.nextLine();
            System.out.print("Nhập vào vị trí mới: ");
            String newLocation = sc.nextLine();
            System.out.print("Nhập tiền lương mới: ");
            double newWage = Double.parseDouble(sc.nextLine());

            employeeService.editServiceEmployees(checkID).setEmployee(newId,newName,newBirthday,
                    newGender,newCCCD,newSDT,newEmail,newAdress,newLever,newLocation,newWage);

        } else {
            System.out.println("Không có mã nhân viên này! ");
            System.out.println("---------------");
        }
    }
}
