package furama_final.views.employee_view;

import furama_final.controllers.employee_controller.EmployeeController;

import java.util.Scanner;

public  class EmployeeView {
    public static void show(){
        EmployeeController employeeController = new EmployeeController();

        Scanner sc = new Scanner(System.in);
        int check;
        boolean checkCase1 = true;
        while (checkCase1) {
            System.out.println("1 Display list employees");
            System.out.println("2 Add new employee");
            System.out.println("3 Edit employee");
            System.out.println("4 Return main menu");
            check = Integer.parseInt(sc.nextLine());
            switch (check) {
                case 1:
                    employeeController.display();
                    break;
                case 2:
                   employeeController.add(AddEmployee.addEmployee());
                    break;
                case 3:
                   employeeController.edit(EditEmployee.editEmployee());
                    break;
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
