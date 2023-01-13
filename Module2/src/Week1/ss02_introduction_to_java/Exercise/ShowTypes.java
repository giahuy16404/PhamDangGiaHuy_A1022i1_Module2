package Week1.ss02_introduction_to_java.Exercise;

import java.util.Scanner;

public class ShowTypes {
    static int choiceNumber;

    //    static int length,height;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            choiceNumber = sc.nextInt();
            switch (choiceNumber) {
                case 1: {
                    System.out.println("Nhập chiều dài:");
                    int length = sc.nextInt();
                    System.out.println("Nhập chiều cao:");
                    int height = sc.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= length; j++) {
                            System.out.print("*");

                        }
                        System.out.println();
                    }
                }
                break;
                case 2: {
                    System.out.println("Nhập chiều cao:");
                    int height = sc.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                break;

                case 3: {
                    System.out.println("Nhập chiều cao:");
                    int height = sc.nextInt();
                    for (int i = height; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                break;
            }
        } while (choiceNumber < 4);
    }
}
