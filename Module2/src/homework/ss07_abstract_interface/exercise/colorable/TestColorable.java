package homework.ss07_abstract_interface.exercise.colorable;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shape = new Square[1];
        shape[0] = new Square("blue",2);
        for (Shape value : shape) {
            System.out.println(value);
            if (value instanceof Colorable) {
                value.howToColor();
            }
        }
}}