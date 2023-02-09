package Week1.ss07_abstract_interface.exercise.resizeable;

import java.util.Scanner;

public class Rectangle implements Resizeable {
    private double width;
    private double length;


    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
    }

    @Override
    public void resize(double percent) {
        double percentIncrease = (acreageRectangle() * percent) / 100;
        double resize = acreageRectangle() + percentIncrease;
        System.out.println("Diện tích hình chữ nhật trước khi tăng "
                + percent + "%: " + acreageRectangle()
                + "\n" + "Diện tích hình chữ nhật sau khi tăng "
                + percent + "%: " + resize + "\n");
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
        double acreageRectangle = width * length;
        return acreageRectangle;
    }

    public double perimeterRectangle() {
        double perimeterRectangle = 2 * (width + length);
        return perimeterRectangle;
    }
}
