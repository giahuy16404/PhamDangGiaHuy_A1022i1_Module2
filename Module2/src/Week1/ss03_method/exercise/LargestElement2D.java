package Week1.ss03_method.exercise;
import java.util.Scanner;
public class LargestElement2D {
    public static double maxNumber2D(double arr[][]) {
        double max = arr[0][0];
        int  lineArr = 0;
        int columArr = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    lineArr = j+1;
                    columArr = j+1;
                }
            }

        }
        return max;
    }

    public static String matrixCoordinates(double arr[][]){
        double max = arr[0][0];
        int  lineArr = 0;
        int columArr = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    lineArr = j+1;
                    columArr = j+1;
                }
            }
        }
        return "\ttọa độ dòng :"+lineArr + "\tcột :" + columArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng");
        int lineNumber = sc.nextInt();
        System.out.println("Nhập vào số cột");
        int someColumns = sc.nextInt();
        double number2D[][] = new double[lineNumber][someColumns];

        for (int i = 0; i < lineNumber; i++) {
            System.out.println("Dong " + (i + 1));
            for (int j = 0; j < someColumns; j++) {
                System.out.println("Moi ban nhap vao dong " + (i + 1) + " Tai vi tri " + (j + 1));
                number2D[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Số lớn nhất trong mảng là:"+maxNumber2D(number2D) + matrixCoordinates(number2D));
    }
}
