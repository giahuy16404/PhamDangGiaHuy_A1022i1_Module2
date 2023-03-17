//package furama_test.controllers;
//
//import furama_test.models.*;
//import furama_test.services.impl.BookingServiceImpl;
//import furama_test.services.impl.CustomerServiceImpl;
//import furama_test.services.impl.EmployeeServiceImpl;
//import furama_test.services.impl.FacilityServiceImpl;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class FuramaControllerTest {
//
//    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
//    CustomerServiceImpl customerService = new CustomerServiceImpl();
//    BookingServiceImpl bookingService = new BookingServiceImpl();
//    FacilityServiceImpl facilityService = new FacilityServiceImpl();
//    Scanner sc = new Scanner(System.in);
//
//    public void displayMainMenu() {
//        while (true) {
//            System.out.println("1. Employee Management");
//            System.out.println("2. Customer Management");
//            System.out.println("3. Facility Management");
//            System.out.println("4. Booking Management");
//            System.out.println("5. Promotion Management");
//            System.out.println("6. Exit");
//            int select = Integer.parseInt(sc.nextLine());
//
//            switch (select) {
//                case 1:
//                    int selectCase1;
//                    boolean checkCase1 = true;
//                    while (checkCase1) {
//                        System.out.println("1 Display list employees");
//                        System.out.println("2 Add new employee");
//                        System.out.println("3 Edit employee");
//                        System.out.println("4 Return main menu");
//                        selectCase1 = Integer.parseInt(sc.nextLine());
//                        switch (selectCase1) {
//                            case 1:
//                                employeeService.displayServicEmpolyees();
//                                break;
//                            case 2:
//                                try {
//                                    System.out.print("Nhập mã nhân viên:");
//                                    String codeEmployees = sc.nextLine();
//
//                                    System.out.print("Nhập họ và tên: ");
//                                    String nameEmployees = sc.nextLine();
//
//                                    System.out.print("Nhập ngày tháng năm sinh dd/MM/yyyy: ");
//                                    String birthDayEmployees = sc.nextLine();
//
//                                    System.out.print("Nhập giới tính: ");
//                                    String genderEmployees = sc.nextLine();
//
//                                    System.out.print("Nhập số căn cước công dân: ");
//                                    int idCCEmployees = Integer.parseInt(sc.nextLine());
//
//                                    System.out.print("Nhập số điện thoại: ");
//                                    int phoneNumberEmployees = Integer.parseInt(sc.nextLine());
//
//                                    System.out.print("Nhập địa chỉ nhà: ");
//                                    String addressEmployees = sc.nextLine();
//
//                                    System.out.print("Nhập địa chỉ email: ");
//                                    String emailEmployees = sc.nextLine();
//
//                                    System.out.print("Nhập trình độ học vấn: ");
//                                    String levelEmployees = sc.nextLine();
//
//                                    System.out.print("Nhập vị trí: ");
//                                    String locationEmployees = sc.nextLine();
//
//                                    System.out.print("Nhập lương nhân viên: ");
//                                    double wage = Double.parseDouble(sc.nextLine());
//                                    System.out.println(" ---------------- ");
//                                    employeeService.addServiceEmployees(new Employee(codeEmployees, nameEmployees,
//                                            birthDayEmployees, genderEmployees, idCCEmployees,
//                                            phoneNumberEmployees, emailEmployees, addressEmployees, levelEmployees, locationEmployees, wage));
//                                } catch (NumberFormatException e) {
//                                    System.out.println("Đã nhập sai định dạng số. Vui lòng nhập lại.");
//                                } catch (Exception e) {
//                                    System.out.println("Đã xảy ra lỗi: " + e.getMessage());
//                                }
//                                break;
//
//
//                            case 3:
//                                System.out.println("Nhập vào mã nhân viên cần thay đổi: ");
//                                String checkID = sc.nextLine();
//                                if (!employeeService.checkId(checkID)) {
//                                    System.out.println("Không có mã nhân viên này! ");
//                                    System.out.println("---------------");
//                                }
//                                while (employeeService.checkId(checkID)) {
//                                    System.out.println("1.Thay đổi mã : ");
//                                    System.out.println("2.Thay đổi tên: ");
//                                    System.out.println("3.Thay đổi ngày sinh : ");
//                                    System.out.println("4.Thay đổi giới tính : ");
//                                    System.out.println("5.Thay đổi căn cước công dân : ");
//                                    System.out.println("6.Thay đổi số điêện thoại : ");
//                                    System.out.println("7.Thay đổi Email : ");
//                                    System.out.println("8.Thay đổi địa chỉ nhà: ");
//                                    System.out.println("9.Thay đổi trình độ học vấn : ");
//                                    System.out.println("10.Thay đổi vị trí : ");
//                                    System.out.println("11.Thay đổi Lương : ");
//                                    System.out.println("12.Thoát:");
//
//                                    System.out.println("-------------");
//                                    System.out.print("Nhập lựa chọn của bạn: ");
//                                    int selectEdit = Integer.parseInt(sc.nextLine());
//                                    switch (selectEdit) {
//                                        case 1:
//                                            System.out.print("Nhập mã nhân viên mới: ");
//                                            String newId = sc.nextLine();
//                                            employeeService.editServiceEmployees(checkID).setCode(newId);
//                                            break;
//                                        case 2:
//                                            System.out.print("Nhập tên nhân viên mới: ");
//                                            String newName = sc.nextLine();
//                                            employeeService.editServiceEmployees(checkID).setName(newName);
//                                            break;
//                                        case 3:
//                                            System.out.print("Nhập ngày tháng năm sinh mới: ");
//                                            String newBirthday = sc.nextLine();
//                                            employeeService.editServiceEmployees(checkID).setDateOfBirth(newBirthday);
//                                            break;
//                                        case 4:
//                                            System.out.print("Nhập ngày giới tính mới: ");
//                                            String newGender = sc.nextLine();
//                                            employeeService.editServiceEmployees(checkID).setGender(newGender);
//                                            break;
//                                        case 5:
//                                            System.out.print("Nhập CCCD mới: ");
//                                            int newCCCD = Integer.parseInt(sc.nextLine());
//                                            employeeService.editServiceEmployees(checkID).setCitizenIdentification(newCCCD);
//                                            break;
//                                        case 6:
//                                            System.out.print("Nhập SDT mới: ");
//                                            int newSDT = Integer.parseInt(sc.nextLine());
//                                            employeeService.editServiceEmployees(checkID).setPhoneNumber(newSDT);
//                                            break;
//                                        case 7:
//                                            System.out.print("Nhập email mới: ");
//                                            String newEmail = sc.nextLine();
//                                            employeeService.editServiceEmployees(checkID).setEmail(newEmail);
//
//                                            break;
//                                        case 8:
//                                            System.out.print("Nhập địa chỉ mới: ");
//                                            String newAdress = sc.nextLine();
//                                            employeeService.editServiceEmployees(checkID).setAddress(newAdress);
//                                            break;
//                                        case 9:
//                                            System.out.print("Nhập trình độ học vấn mới: ");
//                                            String newLever = sc.nextLine();
//                                            employeeService.editServiceEmployees(checkID).setLevel(newLever);
//                                            break;
//                                        case 10:
//                                            System.out.print("Nhập vào vị trí mới: ");
//                                            String newLocation = sc.nextLine();
//                                            employeeService.editServiceEmployees(checkID).setLocation(newLocation);
//                                            break;
//                                        case 11:
//                                            System.out.print("Nhập tiền lương mới: ");
//                                            double newWage = Double.parseDouble(sc.nextLine());
//                                            employeeService.editServiceEmployees(checkID).setWage(newWage);
//                                            break;
//                                        case 12:
//                                            checkID = "-1";
//                                            break;
//                                        default:
//                                            System.out.println("Vui lòng chọn lại: ");
//                                            break;
//                                    }
//                                }
//                            case 4:
//                                checkCase1 = false;
//                                break;
//                            default:
//                                System.out.println("Vui lòng chọn lại: ");
//                                break;
//                        }
//                    }
//                    break;
//                case 2:
//                    int selectCase2;
//                    boolean checkCase2 = true;
//                    while (checkCase2) {
//                        System.out.println("1. Display list customers");
//                        System.out.println("2. Add new customer");
//                        System.out.println("3. Edit customer");
//                        System.out.println("4. Return main menu");
//                        selectCase2 = Integer.parseInt(sc.nextLine());
//                        switch (selectCase2) {
//                            case 1:
//                                customerService.displayCustomer();
//                                break;
//                            case 2:
//                                try {
//
//                                    System.out.print("Nhập vào mã: ");
//                                    String idCustomer = sc.nextLine();
//
//                                    System.out.print("Nhập vào họ và tên: ");
//                                    String nameCustomer = sc.nextLine();
//
//                                    System.out.print("Nhập vào ngày sinh: ");
//                                    String birtdayCustomer = sc.nextLine();
//
//                                    System.out.print("Nhập vào giới tính: ");
//                                    String genderCustomer = sc.nextLine();
//
//                                    System.out.print("Nhập vào số CMND: ");
//                                    int cmndCustomer = Integer.parseInt(sc.nextLine());
//
//                                    System.out.print("Nhập vào số điện thoại: ");
//                                    int numberPhoneCustomer = Integer.parseInt(sc.nextLine());
//
//                                    System.out.print("Nhập vào email: ");
//                                    String emailCustomer = sc.nextLine();
//
//                                    System.out.print("Nhập vào loại khách: ");
//                                    String guestType = sc.nextLine();
//
//                                    System.out.print("Nhập vào địa chỉ: ");
//                                    String locationCustomer = sc.nextLine();
//
//                                    customerService.addCustomer(new Customer(idCustomer, nameCustomer, birtdayCustomer, genderCustomer, cmndCustomer,
//                                            numberPhoneCustomer, emailCustomer, locationCustomer, guestType));
//                                } catch (NumberFormatException e) {
//                                    System.out.println("đã bị lỗi");
//                                } catch (IndexOutOfBoundsException e) {
//                                    System.out.println("Đã bị lỗi");
//                                } catch (Exception e) {
//                                    System.out.println(e.getMessage());
//                                }
//                                break;
//
//                            case 3:
//                                try {
//                                    System.out.print("Nhâp vào mã nhân viên: ");
//                                    String checId = sc.nextLine();
//                                    if (!customerService.checkIdCustoer(checId)) {
//                                        System.out.println("Không có mã nhân viên này!");
//                                        System.out.println("-----------------");
//                                    }
//                                    while (customerService.checkIdCustoer(checId)) {
//                                        System.out.println("1.Thay đổi mã nhân viên.");
//                                        System.out.println("2.Thay đổi họ và tên.");
//                                        System.out.println("3.Thay đổi ngày sinh.");
//                                        System.out.println("4.Thay đổi giới tính.");
//                                        System.out.println("5.Thay đổi chứng minh nhân dân.");
//                                        System.out.println("6.Thay đổi số điện thoại.");
//                                        System.out.println("7.Thay đổi Email.");
//                                        System.out.println("8.Thay đổi loại khách.");
//                                        System.out.println("9.Thay đổi địa chỉ.");
//                                        System.out.println("10.Thoát");
//                                        System.out.print("Mời bạn lựa chọn: ");
//                                        int selectEditCustomer = Integer.parseInt(sc.nextLine());
//
//                                        switch (selectEditCustomer) {
//                                            case 1:
//                                                System.out.print("Nhập mã nhân viên mới: ");
//                                                String newIdCustomer = sc.nextLine();
//                                                customerService.editCustomer(checId).setCode(newIdCustomer);
//                                                break;
//                                            case 2:
//                                                System.out.print("Nhập họ và tên mới: ");
//                                                String newNamCustomer = sc.nextLine();
//                                                customerService.editCustomer(checId).setName(newNamCustomer);
//                                                break;
//                                            case 3:
//                                                System.out.print("Nhập ngày sinh mới: ");
//                                                String newBirtDayCustomer = sc.nextLine();
//                                                customerService.editCustomer(checId).setDateOfBirth(newBirtDayCustomer);
//                                                break;
//                                            case 4:
//                                                System.out.print("Nhập giới tính mới: ");
//                                                String newGender = sc.nextLine();
//                                                customerService.editCustomer(checId).setGender(newGender);
//                                                break;
//                                            case 5:
//                                                System.out.print("Nhập chứng minh nhân dân mới: ");
//                                                int newCmndCustomer = Integer.parseInt(sc.nextLine());
//                                                customerService.editCustomer(checId).setCitizenIdentification(newCmndCustomer);
//                                                break;
//                                            case 6:
//                                                System.out.print("Nhập số điện thoại mới: ");
//                                                int newPhoneCustomer = Integer.parseInt(sc.nextLine());
//                                                customerService.editCustomer(checId).setPhoneNumber(newPhoneCustomer);
//                                                break;
//                                            case 7:
//                                                System.out.print("Nhập email mới: ");
//                                                String newEmailCustomer = sc.nextLine();
//                                                customerService.editCustomer(checId).setEmail(newEmailCustomer);
//                                                break;
//                                            case 8:
//                                                System.out.print("Nhập loại khách mới: ");
//                                                String newGuesTypeCustomer = sc.nextLine();
//                                                customerService.editCustomer(checId).setTypeOfGuest(newGuesTypeCustomer);
//                                                break;
//                                            case 9:
//                                                System.out.print("Nhập địa chỉ mới: ");
//                                                String newLocationCustomer = sc.nextLine();
//                                                customerService.editCustomer(checId).setAddress(newLocationCustomer);
//                                                break;
//                                            case 10:
//                                                checId = "-1";
//                                                break;
//                                        }
//                                    }
//                                } catch (NumberFormatException e) {
//                                    System.out.println("Đã lỗi");
//                                } catch (InputMismatchException e) {
//                                    System.out.println("lỗi");
//                                } catch (IndexOutOfBoundsException e) {
//                                    System.out.println("Lỗi");
//                                }
//                                break;
//                            case 4:
//                                checkCase2 = false;
//                                break;
//                            default:
//                                System.out.println("vui long chon lai");
//                                break;
//                        }
//                    }
//                    break;
//                case 3:
//                    int selectCase3;
//                    boolean checkCase3 = true;
//                    while (checkCase3) {
//                        System.out.println("1 Display list facility");
//                        System.out.println("2 Add new facility");
//                        System.out.println("3 Display list facility maintenance");
//                        System.out.println("4 Return main menu");
//                        selectCase3 = Integer.parseInt(sc.nextLine());
//                        switch (selectCase3) {
//                            case 1:
//                                facilityService.displayServiceFacility();
//                                break;
//                            case 2:
//                                boolean checdAddFacility = true;
//                                while (checdAddFacility) {
//                                    System.out.println("1. Add New Villar");
//                                    System.out.println("2. Add New House");
//                                    System.out.println("3. Add New Room");
//                                    System.out.println("4. Back to menu");
//                                    int sellectAddFacility = Integer.parseInt(sc.nextLine());
//                                    switch (sellectAddFacility) {
//                                        case 1:
//                                            System.out.print("Nhập tên dịch vụ: ");
//                                            String nameServiceVillar = sc.nextLine();
//
//                                            System.out.print("Nhập diện tích sử dụng: ");
//                                            int arenaVillar = Integer.parseInt(sc.nextLine());
//
//                                            System.out.print("Nhập chi phí thuê: ");
//                                            double rentalCostVillar = Integer.parseInt(sc.nextLine());
//
//                                            System.out.print("Nhập số lượng người tối đa: ");
//                                            int numberPeopleVillar = Integer.parseInt(sc.nextLine());
//
//                                            System.out.print("Nhập kiểu thuê: ");
//                                            String rentalTypeVillar = sc.nextLine();
//
//                                            System.out.print("Nhập tiêu chuẩn phòng: ");
//                                            String roomStandardsVillar = sc.nextLine();
//
//                                            System.out.print("Nhập diện tích hồ bơi: ");
//                                            int poolArenaVillar = Integer.parseInt(sc.nextLine());
//
//                                            System.out.print("Nhập số tầng: ");
//                                            int numberFloors = Integer.parseInt(sc.nextLine());
//
//                                            facilityService.addServiceVillar(new Villar(nameServiceVillar, arenaVillar, rentalCostVillar, numberPeopleVillar,
//                                                    rentalTypeVillar, roomStandardsVillar, poolArenaVillar, numberFloors));
//                                            break;
//                                        case 2:
//                                            System.out.print("Nhập tên dịch vụ: ");
//                                            String nameServiceHouse = sc.nextLine();
//
//                                            System.out.print("Nhập diện tích sử dụng: ");
//                                            int arenaHouse = Integer.parseInt(sc.nextLine());
//
//                                            System.out.print("Nhập chi phí thuê: ");
//                                            double rentalCostHouse = Integer.parseInt(sc.nextLine());
//
//                                            System.out.print("Nhập số lượng người tối đa: ");
//                                            int numberPeopleHouse = Integer.parseInt(sc.nextLine());
//
//                                            System.out.print("Nhập kiểu thuê: ");
//                                            String rentalTypeHouse = sc.nextLine();
//
//                                            System.out.print("Nhập tiêu chuẩn phòng: ");
//                                            String roomStandardsHouse = sc.nextLine();
//
//                                            System.out.print("Nhập số tầng: ");
//                                            int numberFloorHouse = Integer.parseInt(sc.nextLine());
//
//                                            facilityService.addServiceHouse(new House(nameServiceHouse, arenaHouse, rentalCostHouse,
//                                                    numberPeopleHouse, rentalTypeHouse, roomStandardsHouse, numberFloorHouse));
//                                            break;
//
//                                        case 3:
//                                            System.out.print("Nhập tên dịch vụ: ");
//                                            String nameServiceRoom = sc.nextLine();
//
//                                            System.out.print("Nhập diện tích sử dụng: ");
//                                            int arenaRoom = Integer.parseInt(sc.nextLine());
//
//                                            System.out.print("Nhập chi phí thuê: ");
//                                            double rentalCostRoom = Integer.parseInt(sc.nextLine());
//
//                                            System.out.print("Nhập số lượng người tối đa: ");
//                                            int numberPeopleRoom = Integer.parseInt(sc.nextLine());
//
//                                            System.out.print("Nhập kiểu thuê: ");
//                                            String rentalTypeRoom = sc.nextLine();
//
//                                            System.out.print("Nhập dịch vụ đi kèm miễn phí: ");
//                                            String freeServiceRoom = sc.nextLine();
//
//                                            facilityService.addServiceRoom(new Room(nameServiceRoom, arenaRoom,
//                                                    rentalCostRoom, numberPeopleRoom, rentalTypeRoom, freeServiceRoom));
//                                            break;
//                                        case 4:
//                                            checdAddFacility = false;
//                                            break;
//                                        default:
//                                            System.out.println("Mời bạn nhập lại!");
//                                    }
//                                }
//                                break;
//                            case 3:
//                                facilityService.displayFacilityMaintenance();
//                                break;
//                            case 4:
//                                checkCase3 = false;
//                                break;
//                            default:
//                                System.out.println("vui long chon lai");
//                                break;
//                        }
//                    }
//                    break;
//                case 4:
//                    int selectCase4;
//                    boolean checkCase4 = true;
//                    while (checkCase4) {
//                        System.out.println("1. Add new booking");
//                        System.out.println("2. Display list booking");
//                        System.out.println("3. Create new constracts");
//                        System.out.println("4. Display list contracts");
//                        System.out.println("5. Edit contracts");
//                        System.out.println("6. Return main menu");
//                        selectCase4 = Integer.parseInt(sc.nextLine());
//                        switch (selectCase4) {
//                            case 1:
//                                customerService.displayCustomer();
//
//                                System.out.print("Nhập mã khách hàng Booking: ");
//                                String idBooking = sc.nextLine();
//                                System.out.print("Nhập mã booking: ");
//                                String codeBooking = sc.nextLine();
//
//                                if (customerService.checkIdCustoer(idBooking)) {
//                                    System.out.println("Nhập dịch vụ sử dụng");
//                                    System.out.println("1. Add New Villar");
//                                    System.out.println("2. Add New House");
//                                    System.out.println("3. Add New Room");
//                                    int sellectAddFacility = Integer.parseInt(sc.nextLine());
//
//                                    String nameServiceBooking = null;
//                                    if (sellectAddFacility == 1) {
//                                        nameServiceBooking = "Villar";
//                                    } else if (sellectAddFacility == 2) {
//                                        nameServiceBooking = "House";
//                                    } else if (sellectAddFacility == 3) {
//                                        nameServiceBooking = "Room";
//                                    }
//                                    switch (sellectAddFacility) {
//                                        case 1:
//                                            System.out.println("-----Booking-----");
//                                            System.out.print("Nhập diện tích sử dụng: ");
//                                            int arenaVillar = Integer.parseInt(sc.nextLine());
//
//                                            System.out.print("Nhập chi phí thuê: ");
//                                            double rentalCostVillar = Integer.parseInt(sc.nextLine());
//
//                                            System.out.print("Nhập số lượng người tối đa: ");
//                                            int numberPeopleVillar = Integer.parseInt(sc.nextLine());
//
//                                            System.out.print("Nhập kiểu thuê: ");
//                                            String rentalTypeVillar = sc.nextLine();
//
//                                            System.out.print("Nhập tiêu chuẩn phòng: ");
//                                            String roomStandardsVillar = sc.nextLine();
//
//                                            System.out.print("Nhập diện tích hồ bơi: ");
//                                            int poolArenaVillar = Integer.parseInt(sc.nextLine());
//
//                                            System.out.print("Nhập số tầng: ");
//                                            int numberFloors = Integer.parseInt(sc.nextLine());
//
//                                            System.out.println("-----Hợp đồng-----");
//
//                                            System.out.print("Nhập số hợp đồng: ");
//                                            String codeContractVillar = sc.nextLine();
//
//                                            System.out.print("Nhập số tiền cọc: ");
//                                            double depositContractVillar = Integer.parseInt(sc.nextLine());
//
//                                            System.out.print("Nhập tổng thanh toán: ");
//                                            double totalPayContractVillar = Integer.parseInt(sc.nextLine());
//
//                                            bookingService.createNewConstracts(new Contract(codeContractVillar, codeBooking,
//                                                    depositContractVillar, totalPayContractVillar, idBooking));
//
//                                            facilityService.addServiceVillar(new Villar(nameServiceBooking, arenaVillar, rentalCostVillar, numberPeopleVillar,
//                                                    rentalTypeVillar, roomStandardsVillar, poolArenaVillar, numberFloors));
//                                            break;
//                                        case 2:
//                                            System.out.println("-----Booking-----");
//                                            System.out.print("Nhập diện tích sử dụng: ");
//                                            int arenaHouse = Integer.parseInt(sc.nextLine());
//
//                                            System.out.print("Nhập chi phí thuê: ");
//                                            double rentalCostHouse = Integer.parseInt(sc.nextLine());
//
//                                            System.out.print("Nhập số lượng người tối đa: ");
//                                            int numberPeopleHouse = Integer.parseInt(sc.nextLine());
//
//                                            System.out.print("Nhập kiểu thuê: ");
//                                            String rentalTypeHouse = sc.nextLine();
//
//                                            System.out.print("Nhập tiêu chuẩn phòng: ");
//                                            String roomStandardsHouse = sc.nextLine();
//
//                                            System.out.print("Nhập số tầng: ");
//                                            int numberFloorHouse = Integer.parseInt(sc.nextLine());
//
//                                            System.out.println("-----Hợp đồng-----");
//
//                                            System.out.print("Nhập số hợp đồng: ");
//                                            String codeContract = sc.nextLine();
//
//                                            System.out.print("Nhập số tiền cọc: ");
//                                            double depositContract = Integer.parseInt(sc.nextLine());
//
//                                            System.out.print("Nhập tổng thanh toán: ");
//                                            double totalPayContract = Integer.parseInt(sc.nextLine());
//
//
//                                            bookingService.createNewConstracts(new Contract(codeContract, codeBooking,
//                                                    depositContract, totalPayContract, idBooking));
//
//                                            facilityService.addServiceHouse(new House(nameServiceBooking, arenaHouse, rentalCostHouse,
//                                                    numberPeopleHouse, rentalTypeHouse, roomStandardsHouse, numberFloorHouse));
//                                            break;
//
//                                        case 3:
//                                            System.out.println("-----Booking-----");
//                                            System.out.print("Nhập diện tích sử dụng: ");
//                                            int arenaRoom = Integer.parseInt(sc.nextLine());
//
//                                            System.out.print("Nhập chi phí thuê: ");
//                                            double rentalCostRoom = Integer.parseInt(sc.nextLine());
//
//                                            System.out.print("Nhập số lượng người tối đa: ");
//                                            int numberPeopleRoom = Integer.parseInt(sc.nextLine());
//
//                                            System.out.print("Nhập kiểu thuê: ");
//                                            String rentalTypeRoom = sc.nextLine();
//
//                                            System.out.print("Nhập dịch vụ đi kèm miễn phí: ");
//                                            String freeServiceRoom = sc.nextLine();
//
//                                            facilityService.addServiceRoom(new Room(nameServiceBooking, arenaRoom,
//                                                    rentalCostRoom, numberPeopleRoom, rentalTypeRoom, freeServiceRoom));
//                                            break;
//                                        default:
//                                            System.out.println("Mời bạn nhập lại!");
//                                    }
//
//                                    System.out.print("Nhập ngày bắt đầu: ");
//                                    int starDayBooking = Integer.parseInt(sc.nextLine());
//
//                                    System.out.print("Nhập ngày kết thúc: ");
//                                    int endDayBooking = Integer.parseInt(sc.nextLine());
//
//                                    System.out.print("Nhập kiểu dịch vụ: ");
//                                    String typeOfServiceBooking = sc.nextLine();
//
//                                    bookingService.addServiceBooking(new Booking(codeBooking, starDayBooking, endDayBooking, nameServiceBooking, idBooking, typeOfServiceBooking));
//
//                                } else {
//                                    System.out.println("Không có mã khách hàng này, mơi bạn nhập lại!");
//                                }
//                                break;
//                            case 2:
//                                bookingService.displayServiceBooking();
//                                break;
//                            case 3:
//                                System.out.print("Nhập số hợp đồng: ");
//                                String codeContract = sc.nextLine();
//
//                                System.out.print("Nhập mã Booking: ");
//                                String codeBookingContract = sc.nextLine();
//
//                                System.out.print("Nhập số tiền cọc: ");
//                                double depositContract = Integer.parseInt(sc.nextLine());
//
//                                System.out.print("Nhập tổng thanh toán: ");
//                                double totalPayContract = Integer.parseInt(sc.nextLine());
//
//                                System.out.print("Nhập mã khách hàng: ");
//                                String idCustomer = sc.nextLine();
//                                bookingService.createNewConstracts(new Contract(codeContract, codeBookingContract,
//                                        depositContract, totalPayContract, idCustomer));
//                                break;
//                            case 4:
//                                bookingService.displayContrac();
//                                break;
//                            case 5:
//                                System.out.print("Nhập vào mã khách hàng: ");
//                                String idCheckCustomer = sc.nextLine();
//                                if (bookingService.checkContract(idCheckCustomer)) {
//                                    while (bookingService.checkContract(idCheckCustomer)) {
//                                        System.out.println("1.Thay đổi số hợp đồng: ");
//                                        System.out.println("2.Thay đổi mã Booking: ");
//                                        System.out.println("3.Thay đổi số tiền cọc: ");
//                                        System.out.println("4.Thay đổi tổng thanh toán: ");
//                                        System.out.println("5.Thoát!");
//                                        int selectEditContract = Integer.parseInt(sc.nextLine());
//                                        switch (selectEditContract) {
//                                            case 1:
//                                                System.out.print("Nhập số hợp đồng mới: ");
//                                                String newIdContract = sc.nextLine();
//                                                bookingService.editContrac(idCheckCustomer).setCodeContract(newIdContract);
//                                                break;
//                                            case 2:
//                                                System.out.print("Nhập mã Booking mới: ");
//                                                String newIdBooking = sc.nextLine();
//                                                bookingService.editContrac(idCheckCustomer).setCodeBooking(newIdBooking);
//                                                break;
//                                            case 3:
//                                                System.out.print("Nhập số tiền cọc mới: ");
//                                                double newDepositContract = Integer.parseInt(sc.nextLine());
//                                                bookingService.editContrac(idCheckCustomer).setDepositInAdvance(newDepositContract);
//                                                break;
//                                            case 4:
//                                                System.out.print("Nhập tổng thanh toán mới: ");
//                                                double newTotalPayContract = Integer.parseInt(sc.nextLine());
//                                                bookingService.editContrac(idCheckCustomer).setTotalMoney(newTotalPayContract);
//                                                break;
//                                            case 5:
//                                                idCheckCustomer = "-1";
//                                                break;
//                                            default:
//                                                System.out.println("Mời bạn nhập lại!");
//                                                break;
//                                        }
//
//                                    }
//                                } else {
//                                    System.out.println("Không có mã trong hệ thống!");
//                                }
//                                break;
//
//                            case 6:
//                                checkCase4 = false;
//                                break;
//                            default:
//                                System.out.println("vui long chon lai");
//                                break;
//                        }
//                    }
//                    break;
//                case 5:
//                    int selectCase5;
//                    boolean checkCase5 = true;
//
//                    while (checkCase5) {
//                        System.out.println("1. Display list customers use service");
//                        System.out.println("2. Display list customers get voucher");
//                        System.out.println("3. Return main menu");
//                        selectCase5 = Integer.parseInt(sc.nextLine());
//                        switch (selectCase5) {
//                            case 1:
//
//                            case 2:
//
//                            case 3:
//                                checkCase5 = false;
//                                break;
//                            default:
//                                System.out.println("vui long chon lai");
//                                break;
//                        }
//                    }
//                    break;
//                case 6:
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Vui long chon lai");
//                    break;
//            }
//        }
//
//    }
//
//    public static void main(String[] args) {
//        FuramaControllerTest furamaController = new FuramaControllerTest();
//    }
//}
