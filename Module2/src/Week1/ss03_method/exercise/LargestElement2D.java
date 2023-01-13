package Week1.ss03_method.exercise;

import java.util.Scanner;

public class LargestElement2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng");
        int lineNumber = sc.nextInt();
        System.out.println("Nhập vào số cột");
        int someColumns = sc.nextInt();


        double number2D[][] = new double[lineNumber][someColumns];
        double max = number2D[0][0];
        for (int i = 0; i <lineNumber ; i++) {
            for (int j = 0; j <someColumns ; j++) {
                number2D[i][j] = sc.nextInt();

            }

        }





        for (int i = 0; i <number2D.length ; i++) {
            for (int j = 0; j <number2D[i].length ; j++) {
                if (max<number2D[i][j]){
                    max = number2D[i][j];
                }
            }
        }
        System.out.println(max);




    }
}
