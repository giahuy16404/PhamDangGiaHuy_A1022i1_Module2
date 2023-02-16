package homework.ss07_abstract_interface.exercise.resizeable;

public class Circle extends Shape  {

    private double radius;

    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {

        System.out.println("Diện tích hình tròn trước khi tăng khi tăng thuộc tính lên:" + percent + "%: " + acreageCircle());
        double percentRadius = radius +  (radius * percent) / 100;
        setRadius(percentRadius);
        System.out.println("Diện tích hình tròn sau khi tăng khi tăng thuộc tính lên:" + percent + "%: " + acreageCircle() + "\n");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double acreageCircle() {
        return Math.sqrt(radius) * Math.PI;
    }

    public double perimeterCircle() {
        return radius * 2 * Math.PI;
    }
}
