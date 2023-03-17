package homework.ss18_string_regex;

import java.util.Scanner;

public class ValidateNameClass {
    public static final String REGEX_NAME = "^[A-P-C][0-9]{4}[G-H-I-K-L-M]$";

    public static Boolean validityCheck(String string) {
        return string.matches(REGEX_NAME);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên lớp học");
        String nameClass = sc.nextLine();
        boolean checkNameClass = validityCheck(nameClass);
        if (checkNameClass) {
            System.out.println(nameClass);
        }
        while (!checkNameClass) {
            System.out.println("bạn đã nhập sai định dạng!");
            System.out.println("Mời nhập lại!");
            nameClass = sc.nextLine();
            checkNameClass = validityCheck(nameClass);
            if (checkNameClass) {
                System.out.println(nameClass);
            }
        }

    }
}


