package homework.ss07_abstract_interface.exercise.resizeable;

public class Square extends Shape  {
    private double edge;

    public Square() {
    }

    @Override
    public void resize(double percent) {
        System.out.println("Diện tích hình vuông trước khi tăng khi tăng thuộc tính lên:"
                + percent + "%: " + acreageSquare());

        double percentRadius = edge + (edge * percent) / 100;
        setEdge(percentRadius);
        System.out.println("Diện tích hình vuông sau khi tăng khi tăng thuộc tính lên:"
                + percent + "%: " + acreageSquare() + "\n");
    }

    public Square(String color, double edge) {
        super(color);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double acreageSquare() {
        return edge * edge;
    }

    public double perimeterSquare() {
        return edge * 4;
    }

}
