package Week1.ss06_inheritance.exercise.circle_cylinder;

public class Circle {
    private String color;
    private static int radius;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getRadius() {
        return radius;
    }

    public double acreageCircle() {
        double acreageCircle = Math.sqrt(radius) * Math.PI;
        return acreageCircle;
    }

    public double perimeterCircle() {
        double perimeterCircle = radius * 2 * Math.PI;
        return perimeterCircle;
    }

    @Override
    public String toString() {
        return "Circle{" + "color='" + color + '\'' + ", radius=" + radius + '}';
    }
}
