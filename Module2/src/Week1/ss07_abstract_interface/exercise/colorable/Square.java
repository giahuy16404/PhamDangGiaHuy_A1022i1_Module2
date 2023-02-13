package Week1.ss07_abstract_interface.exercise.colorable;

public class Square extends Shape implements Colorable {
    private double edge;

    public Square(String color, double edge) {
        super(color);
        this.edge = edge;
    }
    public Square(){
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

    public double acreage() {
        return edge * edge;
    }

    public double perimeterSquare() {
        return edge * 4;
    }

    @Override
    public String toString() {
        return "Area :" + acreage();
    }
}