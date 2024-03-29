package furama_final.views.facility_view;

import furama_final.models.Villa;
import furama_final.utility.MyRegex;
import furama_final.utility.Utility;

import java.util.Scanner;

public class AddVilla {

    public static Villa add() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào tên dịch vụ: ");
        String name = sc.nextLine();
        boolean checkNameService = name.matches(MyRegex.REGEX_NAMESERVICE);
        while (!checkNameService){
            System.out.println("Bạn đã nhập sai định dạng!");
            System.out.print("Mời nhập lại: ");
            name = sc.nextLine();
            checkNameService = name.matches(MyRegex.REGEX_NAMESERVICE);
        }
        System.out.print("Nhập mã dịch vụ: ");
        String id = sc.nextLine();

        boolean checkIdRegex = id.matches(MyRegex.REGEX_IDVILLA);
        boolean checkId = Utility.checkFacility(id);
        while (!checkIdRegex||checkId){
            if (!checkIdRegex){
                System.out.println("Bạn đã nhập sai định dạng!");
                System.out.print("Mời nhập lại: ");
            }
            if (checkId){
                System.out.println("ID đã có trong danh sách!");
                System.out.print("Mời bạn nhập lại: ");
            }
            id = sc.nextLine();
            checkId = Utility.checkFacility(id);
            checkIdRegex = id.matches(MyRegex.REGEX_IDVILLA);
        }


        System.out.print("Nhập vào diện tích sử dụng: ");
        int  arena = 0;
        try {
         arena  = Integer.parseInt(sc.nextLine());
            while (arena < 30){
                System.out.println("Diện tích phải lớn hơn 30m vuông!");
                System.out.print("Mời bạn nhập lại: ");
                arena = Integer.parseInt(sc.nextLine());
            }
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

        System.out.print("Mời bạn nhập vào chi phí thuê: ");
        int rentalCost =0;
        try {
            rentalCost = Integer.parseInt(sc.nextLine());
            while (rentalCost < 0){
                System.out.println("Chi phí thuê phải lớn hơn 0!");
                System.out.println("Mời bạn nhập lại");
                rentalCost = Integer.parseInt(sc.nextLine());
            }
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

        System.out.print("Nhập vào số lượng người sử dụng: ");
        int numberPeople = Integer.parseInt(sc.nextLine());
       while (numberPeople< 0 || numberPeople>20){
            System.out.println("Số lượng người phải lớn hơn 0 và bé hơn 20!");
            System.out.print("Mời bạn nhập lại: ");
            numberPeople = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Nhập vào số tầng: ");
        int numberFloor = Integer.parseInt(sc.nextLine());
       while (numberFloor < 0){
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

        System.out.print("Nhập vào diện tích hồ bơi: ");
        int arenaSwim = Integer.parseInt(sc.nextLine());
        while (arenaSwim < 30){
            System.out.println("Diện tích hồ bơi phải lớn hơn 30m Vuông!");
            System.out.print("mời bạn nhập lại: ");
            arenaSwim = Integer.parseInt(sc.nextLine());
        }


        return new Villa(id,name, arena, rentalCost, numberPeople,
                rentalType, roomStandards,arenaSwim, numberFloor);
    }
}
