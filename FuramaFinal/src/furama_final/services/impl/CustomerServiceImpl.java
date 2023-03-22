package furama_final.services.impl;

import furama_final.models.Customer;
import furama_final.services.CustomerService;
import furama_final.utility.Utility;

import java.io.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    Scanner sc = new Scanner(System.in);
    private static final String FILE_PATH = "D:\\CODEGYM\\Module2\\FuramaFinal\\src\\furama_final\\data\\customer.csv";

    public static void writeFile(LinkedList<Customer> linkedList) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Customer customer : linkedList) {
            bufferedWriter.write(customer.getCode() + "," + customer.getName() + "," +
                    customer.getDateOfBirth() + "," + customer.getGender() + "," +
                    customer.getCitizenIdentification() + "," + customer.getPhoneNumber() +
                    "," + customer.getEmail() + "," + customer.getAddress() + "," + customer.getTypeOfGuest()+ "\n");
        }
        bufferedWriter.close();
    }

    public static LinkedList<Customer> readFile() throws IOException {
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        LinkedList<Customer> list = new LinkedList<>();
        String line;
        Customer customer;
        String[] temp;
        while ((line = bufferedReader.readLine()) != null){
            temp = line.split(",");
            String id = temp[0];
            String name = temp[1];
            String birthday = temp[2];
            String gender = temp[3];
            String cCCD = temp[4];
            String phoneNumber = temp[5];
            String email = temp[6];
            String address = temp[7];
            String typeOf = temp[8];
            customer = new Customer(id,name,birthday,gender,cCCD,phoneNumber,email,address,typeOf);
            list.add(customer);
        }
        bufferedReader.close();
        return list;
    }

    static LinkedList<Customer> linkedList = new LinkedList<>();

    @Override
    public void display() {
        for (Customer customer : linkedList) {
            System.out.println(customer);
        }
    }

    public static boolean checkIdCustomer(String id) {
        boolean check = false;
        for (Customer customer : linkedList) {
            if (customer.getCode().equals(id)) {
                check = true;
                break;
            }
        }
        return check;
    }

    public Customer setCustomer(String id) {
        Customer setCustomer = null;
        for (Customer customer : linkedList) {
            if (customer.getCode().equals(id)) {
                setCustomer = customer;
            }
        }
        return setCustomer;
    }

    @Override
    public void edit(String id) {
        boolean flagId = checkIdCustomer(id);
        if (!flagId) {
            System.out.println("không có mã khách hàng này!");
        }
        if (flagId) {
            Customer newCustomer = setCustomer(id);
            try {
                System.out.print("Nhập mã khách hàng mới: ");
                String newId = sc.nextLine();
                boolean checkId;
                checkId = CustomerServiceImpl.checkIdCustomer(newId);
                while (checkId) {

                    System.out.println("Mã khách hàng bạn nhập đã bị trùng!");
                    System.out.print("Mời bạn nhập lại:");
                    newId = sc.nextLine();
                    checkId = CustomerServiceImpl.checkIdCustomer(newId);
                }
                System.out.print("Nhập họ và tên mới: ");
                String newName = sc.nextLine();
                newCustomer.setName(newName);
                System.out.print("Nhập ngày tháng năm sinh dd/MM/yyyy: ");
                String birthDayEmployees = sc.nextLine();
                boolean checkBirthday = Utility.birthDay(birthDayEmployees);
                while (!checkBirthday) {
                    System.out.println("Hơn 18 tuổi và bé hơn 100!");
                    System.out.println("Mời nhập lại");
                    birthDayEmployees = sc.nextLine();
                    checkBirthday = Utility.birthDay(birthDayEmployees);
                }
                newCustomer.setDateOfBirth(birthDayEmployees);
                System.out.print("Nhập giới tính mới: ");
                String newGender = sc.nextLine();
                System.out.print("Nhập chứng minh nhân dân mới: ");
                String newCmnd = sc.nextLine();
                System.out.print("Nhập số điện thoại mới: ");
                String newPhone = sc.nextLine();
                System.out.print("Nhập email mới: ");
                String newEmail = sc.nextLine();

                String newGuestType = null;
                boolean check = true;
                while (check) {
                    System.out.println("Nhập loại khách mới: ");
                    System.out.println("1.Diamond");
                    System.out.println("2.Platinium");
                    System.out.println("3.Gold");
                    System.out.println("4.Silver");
                    System.out.println("5.Member");
                    int select = Integer.parseInt(sc.nextLine());
                    switch (select) {
                        case 1:
                            newGuestType = "Diamond";
                            check = false;
                            break;
                        case 2:
                            newGuestType = "Platinium";
                            check = false;
                            break;
                        case 3:
                            newGuestType = "Gold, Silver";
                            check = false;
                            break;
                        case 4:
                            newGuestType = "Silver";
                            check = false;
                            break;
                        case 5:
                            newGuestType = "Member";
                            check = false;
                            break;
                        default:
                            System.out.println("Mời bạn nhập lại!");
                    }
                }
                System.out.print("Nhập địa chỉ mới: ");
                String newLocation = sc.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Đã nhập sai định dạng số. Vui lòng nhập lại.");
            } catch (Exception e) {
                System.out.println("Đã xảy ra lỗi: " + e.getMessage());
            }
        }
    }

    @Override
    public void add(Object o) throws IOException {
        LinkedList<Customer> list = readFile();
        list.add((Customer) o);
        writeFile(list);
    }
}
