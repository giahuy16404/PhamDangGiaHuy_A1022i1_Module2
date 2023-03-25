package furama_final.views.facility_view;

import furama_final.models.House;
import furama_final.utility.MyRegex;
import furama_final.utility.Utility;

import java.util.Scanner;

public class AddHouse {
    public static House add() {
        Scanner sc = new Scanner(System.in);
        try {

        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        System.out.println("Nhập tên dịch vụ: ");
        String name = sc.nextLine();
        boolean checkName = name.matches(MyRegex.REGEX_NAMESERVICE);
        while (!checkName) {
            System.out.println("Bạn đã nhập sai định dạng!");
            System.out.print("Mời nhập lại: ");
            name = sc.nextLine();
            checkName = name.matches(MyRegex.REGEX_NAMESERVICE);
        }

        System.out.print("Nhập mã dịch vụ: ");
        String idService = sc.nextLine();
        boolean checkIdRegex = idService.matches(MyRegex.REGEX_IDHOUSE);
        boolean checkId = Utility.checkFacility(idService);

        while (!checkIdRegex || checkId) {
            if(!checkIdRegex){
                System.out.println("Bạn đã nhập sai định dạng!");
                System.out.print("Mời nhập lại: ");
            }
            if (checkId) {
                System.out.println("ID đã có trong danh sách!");
                System.out.print("Mời bạn nhập lại: ");
            }
            idService = sc.nextLine();
            checkIdRegex = idService.matches(MyRegex.REGEX_IDHOUSE);
            checkId = Utility.checkFacility(idService);
        }

        System.out.print("Nhập vào diện tích sử dụng: ");
        int arena = Integer.parseInt(sc.nextLine());
        while ( arena < 30) {
            System.out.println("Diện tích phải lớn hơn 30m vuông!");
            System.out.print("Mời bạn nhập lại: ");
            arena = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Mời bạn nhập vào chi phí thuê: ");
        int rentalCost = Integer.parseInt(sc.nextLine());
        while (rentalCost < 0) {
            System.out.println("Chi phí thuê phải lớn hơn 0!");
            System.out.println("Mời bạn nhập lại");
            rentalCost = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Nhập vào số lượng người sử dụng: ");
        int numberPeople = Integer.parseInt(sc.nextLine());
        while (numberPeople < 0 || numberPeople > 20) {
            System.out.println("Số lượng người phải lớn hơn 0 và bé hơn 20!");
            System.out.print("Mời bạn nhập lại: ");
            numberPeople = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Nhập vào số tầng: ");
        int numberFloor = Integer.parseInt(sc.nextLine());
        while (numberFloor < 0) {
            System.out.println("số tầng phải lớn hơn 0!");
            System.out.print("Mời bạn nhập lại: ");
            numberFloor = Integer.parseInt(sc.nextLine());
        }

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
        return new House(idService, name, arena, rentalCost, numberPeople, rentalType, roomStandards, numberFloor);
    }
}
