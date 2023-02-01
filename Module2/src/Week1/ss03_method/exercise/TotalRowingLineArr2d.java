package Week1.ss03_method.exercise;

import java.util.Scanner;

public class TotalRowingLineArr2d {
    public static int totalRowingLineArr2d(int[][] arr) {
        int totalRowingLine = 0;
        for (int i = 0; i < arr.length; i++) {
            totalRowingLine += arr[i][i];
        }
        return totalRowingLine;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng");
        int lineNumber = sc.nextInt();
        System.out.println("Nhập vào số cột");
        int someColumns = sc.nextInt();
        int[][] number2D = new int[lineNumber][someColumns];

        for (int i = 0; i < lineNumber; i++) {
            System.out.println("Dong " + (i + 1));
            for (int j = 0; j < someColumns; j++) {
                System.out.println("Moi ban nhap vao dong " + (i + 1) + " Tai vi tri " + (j + 1));
                number2D[i][j] = sc.nextInt();
            }
        }
        System.out.println(totalRowingLineArr2d(number2D));
    }
}

