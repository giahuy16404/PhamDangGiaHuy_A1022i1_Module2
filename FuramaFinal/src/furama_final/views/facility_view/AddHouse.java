package furama_final.views.facility_view;

import furama_final.models.House;

import java.util.Scanner;
public class AddHouse {
    public static House add() {
        Scanner sc = new Scanner(System.in);

        String name = "Villa";

        int arena= 110;

        double rentalCost = 130;

        int numberPeople = 15;

        int numberFloor = 6;

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

        String roomStandards = null;
        boolean checkStanRoom = true;
        while (checkStanRoom) {
            System.out.println("Nhập tiêu chuẩn phòng: ");
            System.out.println("I. 5 sao");
            System.out.println("II. 4 sao");
            System.out.println("IV. 3 sao");
            int selectStar = Integer.parseInt(sc.nextLine());
            switch (selectStar) {
                case 1:
                    roomStandards = "5 sao";
                    checkStanRoom = false;
                    break;
                case 2:
                    roomStandards = "4 sao";
                    checkStanRoom = false;
                    break;
                case 3:
                    roomStandards = "3 sao";
                    checkStanRoom = false;
                    break;
            }
        }
        return new House(name,arena,rentalCost,numberPeople,rentalType,roomStandards,numberFloor);
    }
}
