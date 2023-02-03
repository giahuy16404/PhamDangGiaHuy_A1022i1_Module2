package Week1.ss04_class_and_object.exercise;

import java.util.Scanner;

public class BuildClassFan {
    static final int slow = 1;
    static final int medium = 2;
    static final int fast = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;


    public BuildClassFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public BuildClassFan() {
        this(slow, false, 5, "Blue");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        if (this.getOn()) {
            return "Speed:" + this.getSpeed() + " Color:" + this.getColor() + " Radius:" + this.getRadius() + " fan is on";
        } else {
            return "Color:" + this.getColor() + " Radius:" + this.getRadius() + " fan is off";
        }
    }

    public static void main(String[] args) {
        BuildClassFan fan1 = new BuildClassFan(fast, true, 10, "yellow");
        BuildClassFan fan2 = new BuildClassFan(medium, false, 5, "Blue");
        System.out.println(fan1);
        System.out.println(fan2);
    }
}


