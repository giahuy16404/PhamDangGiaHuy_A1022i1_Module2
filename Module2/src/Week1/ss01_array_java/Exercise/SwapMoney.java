package Week1.ss01_array_java.Exercise;

import java.util.Scanner;

public class SwapMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao USD");
        double usd = sc.nextDouble();
        double rate = usd *23000;
        System.out.println(rate+"VND");
    }
}
