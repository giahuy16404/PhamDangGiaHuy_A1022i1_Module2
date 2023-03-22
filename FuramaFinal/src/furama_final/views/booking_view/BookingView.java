package furama_final.views.booking_view;

import furama_final.controllers.booking_controller.BookingController;

import java.io.IOException;
import java.util.Scanner;

public class BookingView {

    public static void show() throws IOException {
        BookingController bookingController = new BookingController();
        Scanner sc = new Scanner(System.in);
        int selectCase4;
        boolean checkCase4 = true;
        while (checkCase4) {
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            selectCase4 = Integer.parseInt(sc.nextLine());
            switch (selectCase4) {
                case 1:
                    bookingController.add(AddBooking.add());
                    break;
                case 2:
                    bookingController.display();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;

                case 6:
                    checkCase4 = false;
                    break;
                default:
                    System.out.println("vui long chon lai");
                    break;
            }
        }

    }
}
