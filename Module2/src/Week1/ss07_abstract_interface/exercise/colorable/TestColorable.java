package Week1.ss07_abstract_interface.exercise.colorable;

import java.util.Arrays;

public class TestColorable {
    public static void main(String[] args) {
        Square[] square = new Square[1];
        square[0] = new Square(2, "String");
        for (int i = 0; i < square.length; i++) {
            System.out.println(square[i].acreageSquare());
            square[i].howToColor();
        }
    }
}
