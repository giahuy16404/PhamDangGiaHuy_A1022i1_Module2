package furama_final.views.facility_view;

import furama_final.controllers.facility_controller.FacilityController;

import java.io.IOException;
import java.util.Scanner;

public class FacilityView {
    public static void show() throws IOException {
        Scanner sc = new Scanner(System.in);
        FacilityController facilityController = new FacilityController();
        int select;
        boolean check = true;
        while (check) {
            System.out.println("1 Display list facility");
            System.out.println("2 Add new facility");
            System.out.println("3 Display list facility maintenance");
            System.out.println("4 Return main menu");
            select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    facilityController.displayListFacility();
                    break;
                case 2:
                    boolean checkCase2 = true;
                    while (checkCase2) {
                        System.out.println("1. Add New Villar");
                        System.out.println("2. Add New House");
                        System.out.println("3. Add New Room");
                        System.out.println("4. Back to menu");
                        int sellectAddFacility = Integer.parseInt(sc.nextLine());
                        switch (sellectAddFacility) {
                            case 1:
                               facilityController.add(AddVilla.add());
                                break;
                            case 2:
                             facilityController.add(AddHouse.add());
                                break;

                            case 3:
                                facilityController.add(AddRoom.add());
                                break;
                            case 4:
                                checkCase2 = false;
                                break;
                            default:
                                System.out.println("Mời bạn nhập lại!");
                        }
                    }
            break;
            case 3:
                facilityController.displayListMaintenance();
                break;
            case 4:
                check = false;
                break;
            default:
                System.out.println("Vui lòng chọn lại: ");
                break;
        }
    }
}
}
