package homework.ss06_inheritance.exercise.point2d_point3d;

public class Point3d extends Point2d {
    private float z;

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3d() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arrayOf3d = {getX(), getY(), z};
        return arrayOf3d;
    }

    @Override
    public String toString() {
        return " ( " + getX() + "," + getY() + "," + z + ")";
    }
}
