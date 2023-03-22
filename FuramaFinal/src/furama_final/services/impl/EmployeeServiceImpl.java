package furama_final.services.impl;

import furama_final.models.Employee;
import furama_final.services.EmployeeService;
import furama_final.utility.Utility;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static final String FILE_EMPLOYEE = "D:\\CODEGYM\\Module2\\FuramaFinal\\src\\furama_final\\data\\employee.csv";
    Scanner sc = new Scanner(System.in);


    public static void writeFile(List<Employee> list) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_EMPLOYEE);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Employee employee : list) {
            bufferedWriter.write(employee.getCode() + "," + employee.getName() + "," +
                    employee.getDateOfBirth() + "," + employee.getGender() + "," + employee.getCitizenIdentification()
                    + "," + employee.getPhoneNumber() + "," + employee.getAddress() + "," + employee.getEmail() + "," + employee.getLevel() +
                    "," + employee.getLocation() + "," + employee.getWage() + "\n"
            );
        }
        bufferedWriter.close();
    }
    public void edit(Employee setEmployee, String id) throws IOException {
        List<Employee> list = readFile();
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).getCode().equals(id)){
                list.set(i,setEmployee);
                break;
            }
        }
        writeFile(list);
    }

    public static List<Employee> readFile() throws IOException {
        FileReader fileReader = new FileReader(FILE_EMPLOYEE);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Employee> list = new ArrayList<>();
        String line;
        String[] temp;
        Employee employee;
        while ((line = bufferedReader.readLine()) != null) {
            temp = line.split(",");
            String id = temp[0];
            String name = temp[1];
            LocalDate birtDay = LocalDate.parse(temp[2]);
            String gender = temp[3];
            String cCCD = temp[4];
            String phoneNumber = temp[5];
            String address = temp[6];
            String email = temp[7];
            String lever = temp[8];
            String location = temp[9];
            String wage = temp[10];
            employee = new Employee(id, name, birtDay, gender, cCCD, phoneNumber, address, email, lever, location, wage);
            list.add(employee);
        }
        fileReader.close();
        bufferedReader.close();
        return list;
    }


    public static boolean checkId(String id) throws IOException {
        boolean check = false;
        List<Employee> list = readFile();
        for (Employee employee : list) {
            if (employee.getCode().equals(id)) {
                check = true;
                break;
            }
        }
        return check;
    }

    public void display() throws IOException {
        List<Employee> list = readFile();

        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    @Override
    public void edit(String id) throws IOException {
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
            LocalDate localDate = Utility.formatDayMonthYear(newBirthday);
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
            String newWage = sc.nextLine();
            edit(new Employee(newId,newName,localDate,newGender,newCCCD,newSDT,newEmail,newAdress,newLever,newLocation,newWage),id);

        } catch (NumberFormatException e) {
            System.out.println("Đã nhập sai định dạng số. Vui lòng nhập lại.");
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }

    @Override
    public void add(Object o) throws IOException {
        List<Employee> list = readFile();
        list.add((Employee) o);
        writeFile(list);
    }

}
