package Week1.ss07_abstract_interface.exercise.resizeable;

public class Circle extends Shape implements Resizeable {

    private double radius;

    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        double percentIncrease = (acreageCircle() * percent) / 100;
        double resize = acreageCircle() + percentIncrease;
        System.out.println("Diện tích hình tròn trước khi tăng "
                + percent + "%:" + acreageCircle() + "\n"
                + "Diện tích hình tròn sau khi tăng "
                + percent + "%: " + resize + "\n");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double acreageCircle() {
        double acreageCircle = Math.sqrt(radius) * Math.PI;
        return acreageCircle;
    }

    public double perimeterCircle() {
        double perimeterCircle = radius * 2 * Math.PI;
        return perimeterCircle;
    }
}
