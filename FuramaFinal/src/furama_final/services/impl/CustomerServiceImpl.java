package furama_final.services.impl;

import furama_final.models.Customer;
import furama_final.services.CustomerService;
import furama_final.utility.Utility;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    Scanner sc = new Scanner(System.in);
    static LinkedList<Customer> linkedList = new LinkedList<>();

    static {
        LocalDate date1 = Utility.formatBirthDay("23/03/2004");
        linkedList.add(new Customer("1", "Hồ Ngọc Oanh", date1, "Nữ", "1027321049",
                "0978633041", "hongocoanh2303@gmail.com", "k52/7 Lâm Hoành", "Plantium"));

        LocalDate date2 = Utility.formatBirthDay("08/03/1979");
        linkedList.add(new Customer("2", "Võ Thị Siêu Nhân", date2, "!Nữ", "1027321049",
                "0978644444", "anhemchat2303@gmail.com", "Sao Hỏa", "Plantium"));

        LocalDate date3 = Utility.formatBirthDay("04/03/1099");
        linkedList.add(new Customer("3", "Bá Ngọc Hoàng", date3, "Nam", "2222221049",
                "091231241", "ongtocacloaiong@gmail.com", "Thiên Đình", "Plantium"));

    }

    @Override
    public void display() {
        for (Customer customer : linkedList) {
            System.out.println(customer);
        }
    }

    public static boolean checkId(String id) {
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
        boolean flagId = checkId(id);
        if (!flagId) {
            System.out.println("không có mã khách hàng này!");
        }
        if (flagId) {
            try {
                System.out.print("Nhập mã khách hàng mới: ");
                String newId = sc.nextLine();
                boolean checkId;
                checkId = CustomerServiceImpl.checkId(newId);
                while (checkId) {

                    System.out.println("Mã khách hàng bạn nhập đã bị trùng!");
                    System.out.print("Mời bạn nhập lại:");
                    newId = sc.nextLine();
                    checkId = CustomerServiceImpl.checkId(newId);
                }
                System.out.print("Nhập họ và tên mới: ");
                String newName = sc.nextLine();
                System.out.print("Nhập ngày tháng năm sinh dd/MM/yyyy: ");
                String birtday = sc.nextLine();
                LocalDate dateOfBirth = Utility.formatBirthDay(birtday);
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
                setCustomer(id).setCustomer(newId, newName, dateOfBirth, newGender, newCmnd, newPhone, newEmail, newLocation, newGuestType);
            } catch (NumberFormatException e) {
                System.out.println("Đã nhập sai định dạng số. Vui lòng nhập lại.");
            } catch (Exception e) {
                System.out.println("Đã xảy ra lỗi: " + e.getMessage());
            }
        }
    }

    @Override
    public void add(Object o) {
        linkedList.add((Customer) o);
    }


}
