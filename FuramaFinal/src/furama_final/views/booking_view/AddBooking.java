package furama_final.views.booking_view;

import furama_final.models.Booking;
import furama_final.services.impl.CustomerServiceImpl;
import furama_final.services.impl.EmployeeServiceImpl;
import furama_final.services.impl.FacilityServiceImpl;
import furama_final.utility.Utility;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AddBooking {

    public static Booking add() throws IOException {
        Booking booking = null;

        Scanner sc = new Scanner(System.in);
        CustomerServiceImpl customerService = new CustomerServiceImpl();

        customerService.display();
        System.out.print("Nhập mã khách hàng Booking: ");
        String idCustomer = sc.nextLine();
        boolean checkId = CustomerServiceImpl.checkIdCustomer(idCustomer);
        while (!checkId) {
            System.out.println("Mã khách hàng bạn booking không có trong hệ thống!");
            System.out.println("Mời bạn nhập lại!");
            idCustomer = sc.nextLine();
            checkId = EmployeeServiceImpl.checkId(idCustomer);
        }

        System.out.println("Nhập dịch vụ sử dụng");
        System.out.println("1. Add New Villa");
        System.out.println("2. Add New House");
        System.out.println("3. Add New Room");
        int selectAddFacility = Integer.parseInt(sc.nextLine());


        switch (selectAddFacility) {
            case 1:
                FacilityServiceImpl.displayListVilla();
                System.out.println("-----------------");
                System.out.println("Mời bạn chọn phòng");
                System.out.print("Nhập mã phòng: ");
                String addVilla = sc.nextLine();
                boolean checkVilla = Utility.checkFacility(addVilla);
                while (!checkVilla) {
                    System.out.println("Không có mã phòng bạn nhập!");
                    System.out.println("Mời nhập lại!");
                    addVilla = sc.nextLine();
                    checkVilla = Utility.checkFacility(addVilla);
                }

                System.out.print("Nhập mã Booking: ");
                String idBookingVilla = sc.nextLine();

                String nameServiceVilla = "Villa";

                System.out.print("Nhập ngày thuê phòng: ");
                String starVilla = sc.nextLine();
                LocalDate checkInVilla = Utility.checkInOut(starVilla);


                System.out.print("Nhập ngày trả phòng: ");
                String endDayVilla = sc.nextLine();
                LocalDate checkOutVilla = Utility.checkInOut(endDayVilla);


                String typeOfServiceVilla = customerService.returnCustomer(idCustomer).getTypeOfGuest();
                booking = new Booking(idBookingVilla, checkInVilla, checkOutVilla, idCustomer, nameServiceVilla, typeOfServiceVilla);
                FacilityServiceImpl.checkUseFacility(Utility.returnFacility(addVilla));

                break;
            case 2:
                FacilityServiceImpl.displayListHouse();
                System.out.println("-----------------");
                System.out.println("Mời bạn chọn phòng");
                System.out.print("Nhập mã phòng: ");
                String addHouse = sc.nextLine();
                boolean checkHouse = Utility.checkFacility(addHouse);
                while (!checkHouse) {
                    System.out.println("Không có mã phòng bạn nhập!");
                    System.out.println("Mời nhập lại!");
                    addHouse = sc.nextLine();
                    checkHouse = Utility.checkFacility(addHouse);
                }
                System.out.print("Nhập mã Booking: ");
                String idBookingHouse = sc.nextLine();

                System.out.print("Nhập ngày thuê phòng: ");
                String starDayHouse = sc.nextLine();
                LocalDate checkInHouse = Utility.checkInOut(starDayHouse);
                System.out.print("Nhập ngày trả phòng: ");
                String endDayHouse = sc.nextLine();
                LocalDate checkOutHouse = Utility.checkInOut(endDayHouse);

                String nameServiceHouse = "House";
                String typeOfServiceHouse = customerService.returnCustomer(idCustomer).getTypeOfGuest();
                booking = new Booking(idBookingHouse, checkInHouse, checkOutHouse, idCustomer, nameServiceHouse, typeOfServiceHouse);
                FacilityServiceImpl.checkUseFacility(Utility.returnFacility(addHouse));

                break;
            case 3:
                FacilityServiceImpl.displayListRoom();
                System.out.println("-----------------");
                System.out.println("Mời bạn chọn phòng");
                System.out.print("Nhập mã phòng: ");
                String addRoom = sc.nextLine();
                boolean checkRoom = Utility.checkFacility(addRoom);
                while (!checkRoom) {
                    System.out.println("Không có mã phòng bạn nhập!");
                    System.out.println("Mời nhập lại!");
                    addRoom = sc.nextLine();
                    checkRoom = Utility.checkFacility(addRoom);
                }
                System.out.print("Nhập mã Booking: ");
                String idBookingRoom = sc.nextLine();


                System.out.print("Nhập ngày thuê phòng: ");
                String starDayRoom = sc.nextLine();
                LocalDate checkInRoom = Utility.checkInOut(starDayRoom);
                System.out.print("Nhập ngày trả phòng: ");
                String endDayRoom = sc.nextLine();
                LocalDate checkOutRoom = Utility.checkInOut(endDayRoom);

                String nameServiceRoom = "Room";
                String typeOfServiceRoom = customerService.returnCustomer(idCustomer).getTypeOfGuest();

                booking = new Booking(idBookingRoom, checkInRoom, checkOutRoom, idCustomer, nameServiceRoom, typeOfServiceRoom);
                FacilityServiceImpl.checkUseFacility(Utility.returnFacility(addRoom));
                break;
        }
        return booking;
    }
}
