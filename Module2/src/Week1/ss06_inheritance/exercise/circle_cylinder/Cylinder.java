package Week1.ss06_inheritance.exercise.circle_cylinder;

public class Cylinder extends Circle {
    private int height;

    public Cylinder(String color, int radius, int height) {
        super(color, radius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double volumeCylinder() {
        double volumeCylinder = getRadius() * 2 * Math.PI;
        return volumeCylinder;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "color='" + getColor() + '\'' + ", radius=" + getRadius() + ", height=" + height + '}';
    }
}
