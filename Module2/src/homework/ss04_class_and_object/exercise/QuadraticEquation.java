package homework.ss04_class_and_object.exercise;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;
    private double getDiscriminant;
    public double getRoot;
    private double getRoot1;
    private double getRoot2;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getGetDiscriminant() {
        double delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }

    public double getGetRoot() {
        getRoot = (-b) / 2 * a;
        return getRoot;
    }

    public double getGetRoot1() {
        getRoot1 = ((-b) + Math.pow(getDiscriminant, 0.5)) / 2 * a;
        return getRoot1;
    }

    public double getGetRoot2() {
        getRoot2 = ((-b) - Math.pow(getDiscriminant, 0.5)) / 2 * a;
        return getRoot2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào A,B,C");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getGetDiscriminant();
        if (delta > 0) {
            double getRoot1 = quadraticEquation.getGetRoot1();
            double getRoot2 = quadraticEquation.getGetRoot2();
            System.out.println("Phương trình có 2 nghiệm " + getRoot1 + " " + getRoot2);
        } else if (delta == 0) {
            double getRoot = quadraticEquation.getGetRoot();
            System.out.println("Phuương trình có nghiệm kép là " + getRoot);
        } else {
            System.out.println("The equation has no roots");
        }

    }
}
