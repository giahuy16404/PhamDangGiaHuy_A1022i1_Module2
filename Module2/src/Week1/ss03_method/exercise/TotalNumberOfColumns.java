package Week1.ss03_method.exercise;

import java.util.Scanner;

public class TotalNumberOfColumns {
//    static
    public static  int sumArrRow(int[][] arr, int index){
        int sumRowArr=0;
        for (int i =0 ; i <arr.length ; i++) {
            sumRowArr += arr[index][i];

        }
        return sumRowArr;
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
        System.out.println("Nhâập vào vị trí");
       int indexArr = sc.nextInt();
        System.out.println(sumArrRow(number2D,indexArr));
    }

}

