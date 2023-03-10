package homework.ss07_abstract_interface.exercise.resizeable;

public class TestResizeable {
    public static void main(String[] args) {

        int percent = (int) (Math.random()*101);
        Shape[] shape = new Shape[3];
        shape[0] = new Circle("Blue", 2);
        shape[1] = new Rectangle("Red", 3, 4);
        shape[2] = new Square("Green", 5);

        for (Shape value : shape) {
            value.resize(percent);
        }
    }
}
