package furama_test.views.facility_view;

import furama_test.models.Villar;

import java.util.Scanner;

public class AddVillar {
    Scanner sc = new Scanner(System.in);

    public Villar add() {

        String nameService = "Villa";
        int usableArea = 160;

        double rentalCosts = 120;

        int numberOfPeople = 18;

        int numberFloors = 8;

        int swimmingPoolArea = 100;


        String rentalTypeVillar = null;
        boolean check = true;
        while (check) {
            System.out.print("Nhập kiểu thuê: ");
            System.out.println("1.Theo năm:");
            System.out.println("2.Theo tháng:");
            System.out.println("3.Theo ngày:");
            System.out.println("4.Theo giờ:");
            int select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    System.out.print("Nhập vào số năm:");
                    String selectYear = sc.nextLine();
                    rentalTypeVillar = selectYear + " năm.";
                    check = false;
                    break;
                case 2:
                    System.out.print("Nhập vào số tháng:");
                    String selectMonth = sc.nextLine();
                    rentalTypeVillar = selectMonth + " tháng.";
                    check = false;
                    break;
                case 3:
                    System.out.print("Nhập vào số ngày:");
                    String selectDay = sc.nextLine();
                    rentalTypeVillar = selectDay + " ngày.";
                    check = false;
                    break;
                case 4:
                    System.out.print("Nhập vào số giờ:");
                    String selectHour = sc.nextLine();
                    rentalTypeVillar = selectHour + " giờ.";
                    check = false;
                    break;
            }
        }

        String roomStandardsVillar = null;
        boolean checkStanRoom = true;
        while (checkStanRoom) {
            System.out.print("Nhập tiêu chuẩn phòng: ");
            System.out.println("I. 5 sao");
            System.out.println("II. 4 sao");
            System.out.println("IV. 3 sao");
            int selectStar = Integer.parseInt(sc.nextLine());
            switch (selectStar) {
                case 1:
                    roomStandardsVillar = "5 sao";
                    checkStanRoom = false;
                    break;
                case 2:
                    roomStandardsVillar = "4 sao";
                    checkStanRoom = false;
                    break;
                case 3:
                    roomStandardsVillar = "3 sao";
                    checkStanRoom = false;
                    break;
            }
        }


        return new Villar(nameService, usableArea, rentalCosts, numberOfPeople,
                rentalTypeVillar, roomStandardsVillar, swimmingPoolArea, numberFloors);
    }
}
