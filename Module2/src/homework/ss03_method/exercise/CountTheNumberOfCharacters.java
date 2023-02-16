package homework.ss03_method.exercise;

import java.util.Scanner;

public class CountTheNumberOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = "PhamDangGiaHuy";
        System.out.println("Nhập vào 1 ký tự cần tìm kiếm:");
        char characters = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (characters == inputString.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
