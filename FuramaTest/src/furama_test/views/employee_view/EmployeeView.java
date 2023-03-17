package furama_test.controllers.employee_view;

import java.util.Scanner;

public  class EmployeeView {
    public static void show(){
        Scanner sc = new Scanner(System.in);
        int selectCase1;
        boolean checkCase1 = true;
        while (checkCase1) {
            System.out.println("1 Display list employees");
            System.out.println("2 Add new employee");
            System.out.println("3 Edit employee");
            System.out.println("4 Return main menu");
            selectCase1 = Integer.parseInt(sc.nextLine());
            switch (selectCase1) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:

                case 4:
                    checkCase1 = false;
                    break;
                default:
                    System.out.println("Vui lòng chọn lại: ");
                    break;
            }
        }
    }
}
