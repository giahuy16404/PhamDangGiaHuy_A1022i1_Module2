package Week1.ss03_method.exercise;
import java.util.Scanner;
public class LargestElement2D {
    public static double maxNumber2D(double arr[][]) {
        double max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }

        }
        return max;
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
        System.out.println("So lon nhat trong mang la :" + maxNumber2D(number2D));
    }
}
