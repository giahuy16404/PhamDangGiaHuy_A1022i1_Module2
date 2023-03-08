package homework.ss15_exception_debug.exrcise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập vao số a");
            int a = sc.nextInt();

            System.out.println("Nhập vào số b");
            int b = sc.nextInt();

            System.out.println("Nhập vào số c");
            int c = sc.nextInt();
            if (a < 0 || b < 0 || c < 0) {
                throw new IllegalTriangleException("Nhập một số lớn hơn 0");
            } else if (a + b < c || a + c < b || b + c < a) {
                throw new IllegalTriangleException("nhập  tổng 2 cạnh không lớn hơn cạnh còn lại ");
            }
        } catch (InputMismatchException e) {
            System.out.println("Nhập số!");
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Ket thuc chuong trinh!");
        }
    }
}
