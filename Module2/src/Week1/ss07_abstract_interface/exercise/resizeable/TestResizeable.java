package Week1.ss07_abstract_interface.exercise.resizeable;

import java.util.Scanner;

public class TestResizeable {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(3, 4);
        Square square = new Square(5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào phần trăm tăng diện tích");
        int percent = sc.nextInt();
        circle.resize(percent);
        rectangle.resize(percent);
        square.resize(percent);
    }
}
