package furama_final.services.impl;

import furama_final.models.Employee;
import furama_final.services.EmployeeService;
import furama_final.utility.Utility;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    Scanner sc = new Scanner(System.in);
    static List<Employee> arrayList = new ArrayList<>();

    static {
        LocalDate localDate1 = Utility.formatBirthDay("16/04/2004");
        arrayList.add(new Employee("1", "Phạm Đặng Gia Huy", localDate1, "Nam",
                "1021827544", "0974524210", "phamhuy1642004@gmail.com",
                "k230,Trần Hưng Đạo", "Đại học", "Giám đốc", 999999));

        LocalDate localDate2 = Utility.formatBirthDay("20/07/2011");
        arrayList.add(new Employee("2", "Phạm Đặng Gia Vỹ", localDate2, "Nam",
                "2021857544", "0974124210", "vy1642004@gmail.com",
                "k230,Trần Hưng Đạo", "Trung Cấp", "Quản lý", 299999));

        LocalDate localDate3 = Utility.formatBirthDay("20/07/1979");
        arrayList.add(new Employee("3", "Đặng Thị Thanh Thanh", localDate3, "Nữ",
                "1021827544", "0974524210", "phamhuy1642004@gmail.com",
                "k230,Trần Hưng Đạo", "Sau đại học", "Giám đốc", 98999));
    }


    public static boolean checkId(String id) {
        boolean check = false;
        for (Employee employee : arrayList) {
            if (employee.getCode().equals(id)) {
                check = true;
                break;
            }
        }
        return check;
    }

    public Employee setEmployee(String id) {
        Employee setEmployee = null;
        for (Employee employee : arrayList) {
            if (employee.getCode().equals(id)) {
                setEmployee = employee;
            }
        }
        return setEmployee;
    }

    public void display() {
        for (Employee employee : arrayList) {
            System.out.println(employee);
        }
    }

    @Override

    public void edit(String id) {
        boolean flagId = checkId(id);
        if (!flagId) {
            System.out.println("không có mã nhân viên này!");
        }
        if (flagId) {
            try {
                System.out.print("Nhập mã nhân viên mới: ");
                String newId = sc.nextLine();
                boolean checkId;
                checkId = EmployeeServiceImpl.checkId(newId);
                while (checkId) {
                    System.out.println("Mã nhân viên bạn nhập đã bị trùng!");
                    System.out.print("Mời bạn nhập lại:");
                    newId = sc.nextLine();
                    checkId = EmployeeServiceImpl.checkId(newId);
                }
                System.out.print("Nhập tên nhân viên mới: ");
                String newName = sc.nextLine();
                System.out.print("Nhập ngày tháng năm sinh mới dd/MM/yyyy: ");
                String newBirthday = sc.nextLine();
                LocalDate localDate = Utility.formatBirthDay(newBirthday);

                System.out.print("Nhập ngày giới tính mới: ");
                String newGender = sc.nextLine();
                System.out.print("Nhập CCCD mới: ");
                String newCCCD = sc.nextLine();
                System.out.print("Nhập SDT mới: ");
                String newSDT = sc.nextLine();
                System.out.print("Nhập email mới: ");
                String newEmail = sc.nextLine();
                System.out.print("Nhập địa chỉ mới: ");
                String newAdress = sc.nextLine();

                String newLever = null;
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
                            newLever = "Trung cấp";
                            check = false;
                            break;
                        case 2:
                            newLever = "Cao đẳng";
                            check = false;
                            break;
                        case 3:
                            newLever = "Đại học";
                            check = false;
                            break;
                        case 4:
                            newLever = "Sau đại học";
                            check = false;
                            break;
                        default:
                            System.out.println("Mời bạn nhập lại!");
                    }
                }

                String newLocation = null;
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
                            newLocation = "Lễ tân";
                            checkLocation = false;
                            break;
                        case 2:
                            newLocation = "Phục vụ";
                            checkLocation = false;
                            break;
                        case 3:
                            newLocation = "Chuyên viên";
                            checkLocation = false;
                            break;
                        case 4:
                            newLocation = "Giám sát";
                            checkLocation = false;
                            break;
                        case 5:
                            newLocation = "Quản lý";
                            checkLocation = false;
                            break;
                        case 6:
                            newLocation = "Giám đốc";
                            checkLocation = false;
                            break;
                        default:
                            System.out.println("Mời bạn nhập lại!");
                    }
                }
                System.out.print("Nhập tiền lương mới: ");
                double newWage = Double.parseDouble(sc.nextLine());

                setEmployee(id).setEmployee(newId, newName, localDate,
                        newGender, newCCCD, newSDT, newEmail, newAdress, newLever, newLocation, newWage);
            } catch (NumberFormatException e) {
                System.out.println("Đã nhập sai định dạng số. Vui lòng nhập lại.");
            } catch (Exception e) {
                System.out.println("Đã xảy ra lỗi: " + e.getMessage());
            }
        }
    }


    @Override
    public void add(Object o) {
        arrayList.add((Employee) o);
    }

}
