package Week1.ss07_abstract_interface.exercise.resizeable;

import java.util.Scanner;

public class TestResizeable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào phần trăm cần tăng:");
        int percent = sc.nextInt();

        Shape[] shape = new Shape[3];
        shape[0] = new Circle("Blue", 2);
        shape[1] = new Rectangle("Red", 3, 4);
        shape[2] = new Square("Green", 5);

        for (int i = 0; i < shape.length; i++) {
            shape[i].resize(percent);
        }
    }
}
