package Week1.ss07_abstract_interface.exercise.resizeable;

public class Square implements Resizeable {
    private double edge;

    @Override
    public void resize(double percent) {
        double percentIncrease = (acreageSquare() * percent) / 100;
        double resize = acreageSquare() + percentIncrease;
        System.out.println("Diện tích hinh vuông trước khi tăng "
                + percent + "%: "
                + acreageSquare() + "\n"
                + "Diện tích hinh vuông sau khi tăng "
                + percent + "%: " + resize + "\n");
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square() {
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double acreageSquare() {
        double arceageSquare = edge * edge;
        return arceageSquare;
    }

    public double perimeterSquare() {
        return edge * 4;
    }
}
