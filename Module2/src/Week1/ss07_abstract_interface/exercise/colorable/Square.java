package Week1.ss07_abstract_interface.exercise.colorable;

public class Square implements Colorable {
    private double edge;
    private String color;

    public Square(double edge, String color) {
        this.edge = edge;
        this.color = color;
    }

    public Square() {
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void acreage() {
        System.out.println(edge*edge);
    }

    public double perimeterSquare() {
        return edge * 4;
    }
}