package furama_final.views.customer_view;

import furama_final.controllers.customer_controller.CustomerController;

import java.util.Scanner;

public class CustomerView {
    public static void show(){
        CustomerController customerController = new CustomerController();
        Scanner sc = new Scanner(System.in);
        int select;
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    customerController.display();
                    break;
                case 2:
                    customerController.add(AddCustomer.add());
                    break;
                case 3:
                    customerController.edit(EditCustomer.edit());
                    break;
                case 4:
                    check = false;
                    break;
                default:
                    System.out.println("Vui lòng chọn lại: ");
                    break;
            }
        }
    }
}
