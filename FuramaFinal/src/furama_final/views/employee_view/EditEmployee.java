package furama_final.views.employee_view;

import java.util.Scanner;

public class EditEmployee {
    public static String editEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mã nhân viên cần thay đổi: ");
        return sc.nextLine();
    }
}
