package Week1.ss05_static_method_static_property.exercise;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
       return radius;
    }

    public static void main(String[] args) {
        Circle testCircle = new Circle();
        System.out.println(testCircle.getRadius());
    }
}
