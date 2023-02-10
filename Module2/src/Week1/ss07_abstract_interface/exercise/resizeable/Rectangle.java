package Week1.ss07_abstract_interface.exercise.resizeable;

import java.util.Scanner;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double length;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
    }

    @Override
    public void resize(double percent) {

        System.out.println("Diện tích hình chữ nhật trước khi tăng " + percent + "%: " + acreageRectangle());

        setWidth(percent + width);
        setLength(percent + length);

        System.out.println("Diện tích hình chữ nhật sau khi tăng " + percent + "%: " + acreageRectangle() + "\n");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double acreageRectangle() {
        return width * length;
    }

    public double perimeterRectangle() {
        return 2 * (width + length);
    }
}
