package controller;

import model.Student;
import service.StudentService;

import java.util.Scanner;

public class Menu {
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true){
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm mới danh sách: ");
            System.out.println("3. Sửa thông tin");
            System.out.println("4. Xóa theo id.");
            System.out.println("5. Tìm tên theo id.");
            System.out.println("6. Sắp xếp điểm cao");
            System.out.println("7. Sắp xếp điểm thấp:");
            System.out.println("8. thoát:");
            int select = Integer.parseInt(sc.nextLine());
            switch (select){
                case 1:
                    service.display();
                    break;
                case 2:
                    System.out.println("Nhập tên: ");
                    String name = sc.nextLine();

                    System.out.println("Nhập ngày tháng năm sinh: ");
                    String date = sc.nextLine();

                    System.out.println("Nhập giới tính: ");
                    String gender = sc.nextLine();

                    System.out.println("Nhập mã học sinh: ");
                    String id =  sc.nextLine();

                    System.out.println("Nhập tên lớp: ");
                    String nameClass = sc.nextLine();

                    System.out.println("Nhaập điểm trung bình: ");
                    int diem = Integer.parseInt(sc.nextLine());
                    service.add(new Student(name,date,gender,id,nameClass,diem));
                    break;
                case 3:
                    System.out.println("Mời bạn chọn học sinh muốn sửa thông tin: ");
                    service.display();
                    String selectEditId = sc.nextLine();
                    boolean check = service.checkId(selectEditId);

                    while (!check){
                        System.out.println("Mã bạn nhập không có trong danh sách mời bạn nhập lại:");
                        selectEditId = sc.nextLine();
                        check = service.checkId(selectEditId);
                    }
                    System.out.println("Nhập tên: ");
                    String newName = sc.nextLine();

                    System.out.println("Nhập ngày tháng năm sinh: ");
                    String newDate = sc.nextLine();

                    System.out.println("Nhập giới tính: ");
                    String newGender = sc.nextLine();

                    System.out.println("Nhập mã học sinh: ");
                    String newId =  sc.nextLine();

                    System.out.println("Nhập tên lớp: ");
                    String newNameClass = sc.nextLine();

                    System.out.println("Nhaập điểm trung bình: ");
                    int newDiem = Integer.parseInt(sc.nextLine());

                    Student student = new Student(newName,newDate,newGender,newId,newNameClass,newDiem);
                    service.edit(selectEditId,student);
                    break;
                case 4:
                    System.out.println("Mời bạn chọn học sinh muốn xóa: ");
                    service.display();
                    String selectRemove= sc.nextLine();
                    boolean checkRemove = service.checkId(selectRemove);

                    while (!checkRemove){
                        System.out.println("Mã bạn nhập không có trong danh sách mời bạn nhập lại:");
                        selectEditId = sc.nextLine();
                        checkRemove = service.checkId(selectEditId);
                    }
                    service.delete(selectRemove);
                    break;
                case 5:
                    break;
                case 6:
                    service.caoDenThap();
                    break;
                case 7:
                    service.thapDenCao();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời bạn chọn trong danh sách");
            }
        }

    }

    public static void main(String[] args) {
        Menu.menu();
    }
}
