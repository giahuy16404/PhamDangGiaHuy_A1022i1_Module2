package furama_final.views.home_view;

import furama_final.views.booking_view.BookingView;
import furama_final.views.customer_view.CustomerView;
import furama_final.views.employee_view.EmployeeView;
import furama_final.views.facility_view.FacilityView;

import java.io.IOException;
import java.util.Scanner;

public class HomeView {
    public static void displayHomeMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            int select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    EmployeeView.show();
                    break;
                case 2:
                    CustomerView.show();
                    break;
                case 3:
                    FacilityView.show();
                    break;
                case 4:
                    BookingView.show();
                    break;
                case 5:
                    break;
                case 6:
                    check = false;
                    break;
            }
        }

    }

    public static void main(String[] args) throws IOException {
        displayHomeMenu();
    }
}
