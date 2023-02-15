package Week1.ss07_abstract_interface.exercise.resizeable;

public abstract class Shape implements Resizeable {
    private String color;

    public Shape(String color) {
        this.color = color;
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
