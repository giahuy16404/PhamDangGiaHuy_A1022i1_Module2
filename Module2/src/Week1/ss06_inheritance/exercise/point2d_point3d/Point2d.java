package Week1.ss06_inheritance.exercise.point2d_point3d;

public class Point2d {
    private float x;
    private float y;

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2d() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.y = y;
        this.x = x;
    }

    public float[] getXY() {
        float[] arrayOf2d = {x, y};
        return arrayOf2d;
    }

    @Override
    public String toString() {
        return "Point2d{" + "x=" + x + ", y=" + y + '}';
    }
}
