package homework.ss18_string_regex;

import java.util.Scanner;

public class ValidateNumberPhone {
    public static final String REGEX_NAME = "\\([0-9]{2}\\)-\\([0-9]{9}\\)";

    public static Boolean validateNumberPhone(String string) {
        return string.matches(REGEX_NAME);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên lớp học");
        String numberClass = sc.nextLine();
        boolean checkPhoneClass = validateNumberPhone(numberClass);
        if (checkPhoneClass) {
            System.out.println(numberClass);
        }
        while (!checkPhoneClass) {
            System.out.println("bạn đã nhập sai định dạng!");
            System.out.println("Mời nhập lại!");
            numberClass = sc.nextLine();
            checkPhoneClass = validateNumberPhone(numberClass);
            if (checkPhoneClass) {
                System.out.println(numberClass);
            }
        }

    }
}
