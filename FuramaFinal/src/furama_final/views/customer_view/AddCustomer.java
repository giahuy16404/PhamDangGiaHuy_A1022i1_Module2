package furama_final.views.customer_view;

import furama_final.models.Customer;
import furama_final.services.impl.CustomerServiceImpl;
import furama_final.utility.Utility;

import java.time.LocalDate;
import java.util.Scanner;

public class AddCustomer {
    public static Customer add() {
        Scanner sc = new Scanner(System.in);
        Customer customer = null;
        try {
            System.out.print("Nhập mã khách hàng:");
            String id = sc.nextLine();
            boolean checkId;
            checkId = CustomerServiceImpl.checkId(id);
            while (checkId) {

                System.out.println("Mã khách hàng  bạn nhập đã bị trùng!");
                System.out.print("Mời bạn nhập lại:");
                id = sc.nextLine();
                checkId = CustomerServiceImpl.checkId(id);
            }

            System.out.print("Nhập vào họ và tên: ");
            String name = sc.nextLine();

            System.out.print("Nhập ngày tháng năm sinh dd/MM/yyyy: ");
            String birthday = sc.nextLine();

            LocalDate dateOfBirth = Utility.formatBirthDay(birthday);

            System.out.print("Nhập vào giới tính: ");
            String gender = sc.nextLine();

            System.out.print("Nhập vào số CMND: ");
            String cmnd = sc.nextLine();

            System.out.print("Nhập vào số điện thoại: ");
            String numberPhone = sc.nextLine();

            System.out.print("Nhập vào email: ");
            String email = sc.nextLine();

            System.out.print("Nhập vào địa chỉ: ");
            String location = sc.nextLine();

            String guestType = null;
            boolean check = true;
            while (check) {
                System.out.println("Nhập loại khách: ");
                System.out.println("1.Diamond");
                System.out.println("2.Platinium");
                System.out.println("3.Gold, Silver");
                System.out.println("4.Member");
                int select = Integer.parseInt(sc.nextLine());
                switch (select) {
                    case 1:
                        guestType = "Diamond";
                        check = false;
                        break;
                    case 2:
                        guestType = "Platinium";
                        check = false;
                        break;
                    case 3:
                        guestType = "Gold, Silver";
                        check = false;
                        break;
                    case 4:
                        guestType = "Member";
                        check = false;
                        break;
                    default:
                        System.out.println("Mời bạn nhập lại!");
                }
            }


            System.out.println(" ---------------- ");

            customer = new Customer(id,name,dateOfBirth,gender,cmnd,numberPhone,email,location,guestType);
        } catch (NumberFormatException e) {
            System.out.println("Đã nhập sai định dạng số. Vui lòng nhập lại.");
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
        return customer;
    }
}
