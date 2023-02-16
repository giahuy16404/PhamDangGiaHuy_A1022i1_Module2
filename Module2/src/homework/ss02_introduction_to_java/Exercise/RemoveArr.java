package homework.ss02_introduction_to_java.Exercise;

import java.util.Scanner;

public class RemoveArr {
    static int[] numbers;

    public static void main(String[] args) {
        numbers = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Nhập phần tử vào manảng tại vị trí " + i);
            numbers[i] = sc.nextInt();
        }
        int i = 0;
        System.out.println("Nhập vào vị trí cần xóa trong mảng");
        int indexRemove = sc.nextInt();

        while (i < numbers.length) {
            if (i == indexRemove) {
                while (i < numbers.length - 1) {
                    numbers[i] = numbers[i + 1];
                    i++;
                }
                numbers[numbers.length - 1] = 0;
                break;
            }
            i++;
        }
        for (int value : numbers) {
            System.out.println(value);
        }
    }
}

