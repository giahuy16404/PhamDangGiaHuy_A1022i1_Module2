package furama_test.controllers.home_view;

import furama_test.controllers.employee_view.EmployeeView;
import furama_test.models.Employee;

import java.util.Scanner;

public class HomeView {
    public static void displayHomeMenu(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            int select = Integer.parseInt(sc.nextLine());
            switch (select){
                case 1:
                   EmployeeView.show();
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
            }
        }

    }

}
