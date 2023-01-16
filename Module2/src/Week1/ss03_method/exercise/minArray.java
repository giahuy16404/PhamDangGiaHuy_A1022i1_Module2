package Week1.ss03_method.exercise;

import java.util.Scanner;

public class minArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dai của mảng");
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.println("Nhập vào phần tử trong array tại vị trí thứu"+ i);
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for (int i = 0; i <size ; i++) {
            if (min>array[i]){
                min = array[i];

            }

        }
        System.out.println("giá trị nhỏ nhất của mảng là :"+min);

    }
}
