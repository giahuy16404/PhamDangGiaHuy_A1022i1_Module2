package furama_final.views.customer_view;

import java.util.Scanner;

public class EditCustomer {
    public static String edit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mã nhân viên cần thay đổi: ");
        return sc.nextLine();
    }
}
