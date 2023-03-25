package furama_final.views.employee_view;

import furama_final.models.Employee;
import furama_final.services.impl.EmployeeServiceImpl;
import furama_final.utility.MyRegex;
import furama_final.utility.Utility;

import java.util.Scanner;

public class AddEmployee {
    public static Employee addEmployee() {
        Scanner sc = new Scanner(System.in);
        Employee employee = null;
        try {
            System.out.print("Nhập mã nhân viên:");
            String code = sc.nextLine();
            boolean checkId = EmployeeServiceImpl.checkId(code);
            while (checkId) {

                System.out.println("Mã nhân viên bạn nhập đã bị trùng!");
                System.out.print("Mời bạn nhập lại:");
                code = sc.nextLine();
                checkId = EmployeeServiceImpl.checkId(code);
            }

            System.out.println("Nhập họ và tên: ");
            String name = sc.nextLine();
            boolean checkName = name.matches(MyRegex.REGEX_FIRSLASSNAME);
            while (!checkName) {
                System.out.println("Bạn đã nhập sai định dạng!");
                System.out.print("Mời nhập lại: ");
                name = sc.nextLine();
                checkName = name.matches(MyRegex.REGEX_FIRSLASSNAME);
            }

            System.out.print("Nhập ngày tháng năm sinh dd/MM/yyyy: ");
            String birthDayEmployees;
            birthDayEmployees = sc.nextLine();
            boolean checkBirthday = Utility.birthDay(birthDayEmployees);
            while (!checkBirthday) {
                System.out.println("Hơn 18 tuổi và bé hơn 100!");
                System.out.println("Mời nhập lại");
                birthDayEmployees = sc.nextLine();
                checkBirthday = Utility.birthDay(birthDayEmployees);
            }

            System.out.print("Nhập giới tính: ");
            String gender = sc.nextLine();

            System.out.print("Nhập số căn cước công dân: ");
            String idCC = sc.nextLine();

            System.out.print("Nhập số điện thoại: ");
            String phoneNumber = sc.nextLine();

            System.out.print("Nhập địa chỉ nhà: ");
            String address = sc.nextLine();

            System.out.print("Nhập địa chỉ email: ");
            String email = sc.nextLine();

            String lever = null;
            boolean check = true;
            while (check) {
                System.out.println("Nhập trình độ học vấn: ");
                System.out.println("1.Trung cấp");
                System.out.println("2.Cao đẳng");
                System.out.println("3.Đại học");
                System.out.println("4.Sau đại học");
                int select = Integer.parseInt(sc.nextLine());
                switch (select) {
                    case 1:
                        lever = "Trung cấp";
                        check = false;
                        break;
                    case 2:
                        lever = "Cao đẳng";
                        check = false;
                        break;
                    case 3:
                        lever = "Đại học";
                        check = false;
                        break;
                    case 4:
                        lever = "Sau đại học";
                        check = false;
                        break;
                    default:
                        System.out.println("Mời bạn nhập lại!");
                }
            }

            String location = null;
            boolean checkLocation = true;
            while (checkLocation) {
                System.out.println("Nhập vị trí công việc: ");
                System.out.println("1.Lễ tân");
                System.out.println("2.Phục vụ");
                System.out.println("3.Chuyên viên");
                System.out.println("4.Giám sát");
                System.out.println("5.Quản lý");
                System.out.println("6.Giám đốc");
                int select = Integer.parseInt(sc.nextLine());
                switch (select) {
                    case 1:
                        location = "Lễ tân";
                        checkLocation = false;
                        break;
                    case 2:
                        location = "Phục vụ";
                        checkLocation = false;
                        break;
                    case 3:
                        location = "Chuyên viên";
                        checkLocation = false;
                        break;
                    case 4:
                        location = "Giám sát";
                        checkLocation = false;
                        break;
                    case 5:
                        location = "Quản lý";
                        checkLocation = false;
                        break;
                    case 6:
                        location = "Giám đốc";
                        checkLocation = false;
                        break;
                    default:
                        System.out.println("Mời bạn nhập lại!");
                }
            }
            System.out.print("Nhập lương nhân viên: ");
            String wage = sc.nextLine();
            System.out.println(" ---------------- ");

            employee = new Employee(code, name, birthDayEmployees, gender, idCC, phoneNumber, address, email
                    , lever, location, wage);

        } catch (NumberFormatException e) {
            System.out.println("Đã nhập sai định dạng số. Vui lòng nhập lại.");
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
        return employee;
    }
}
