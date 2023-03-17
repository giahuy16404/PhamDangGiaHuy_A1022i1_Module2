package furama_final.views.facility_view;

import furama_final.models.Room;

import java.util.Scanner;

public class AddRoom {
    public static Room add() {
        Scanner sc = new Scanner(System.in);

        String name = "Room";

        int arena = 90;

        double rentalCost = 110;

        int numberPeople = 6;

        String freeService = "Nước suối";

        String rentalType = null;
        boolean check = true;
        while (check) {
            System.out.println("Nhập kiểu thuê: ");
            System.out.println("1.Theo năm:");
            System.out.println("2.Theo tháng:");
            System.out.println("3.Theo ngày:");
            System.out.println("4.Theo giờ:");
            int select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    System.out.print("Nhập vào số năm:");
                    String selectYear = sc.nextLine();
                    rentalType = selectYear + " năm.";
                    check = false;
                    break;
                case 2:
                    System.out.print("Nhập vào số tháng:");
                    String selectMonth = sc.nextLine();
                    rentalType = selectMonth + " tháng.";
                    check = false;
                    break;
                case 3:
                    System.out.print("Nhập vào số ngày:");
                    String selectDay = sc.nextLine();
                    rentalType = selectDay + " ngày.";
                    check = false;
                    break;
                case 4:
                    System.out.print("Nhập vào số giờ:");
                    String selectHour = sc.nextLine();
                    rentalType = selectHour + " giờ.";
                    check = false;
                    break;
            }
        }

        return new Room(name, arena, rentalCost, numberPeople, rentalType, freeService);
    }
}
