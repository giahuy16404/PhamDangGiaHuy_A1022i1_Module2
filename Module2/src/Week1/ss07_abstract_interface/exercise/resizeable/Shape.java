package Week1.ss07_abstract_interface.exercise.resizeable;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public void resize(double percent) {
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
