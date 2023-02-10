package Week1.ss07_abstract_interface.exercise.resizeable;

import java.util.Scanner;

public class TestResizeable {
    public static void main(String[] args) {

        double percent = Math.random()*100;
        Shape[] shape = new Shape[3];
        shape[0] = new Circle("Blue", 2);
        shape[1] = new Rectangle("Red", 3, 4);
        shape[2] = new Square("Green", 5);

        for (Shape value : shape) {
            value.resize(percent);
        }
    }
}
