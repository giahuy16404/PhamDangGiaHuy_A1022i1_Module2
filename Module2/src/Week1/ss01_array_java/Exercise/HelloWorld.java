package Week1.ss01_array_java.Exercise;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello: " + name);
    }

}
