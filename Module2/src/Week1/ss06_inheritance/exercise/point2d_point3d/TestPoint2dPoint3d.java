package Week1.ss06_inheritance.exercise.point2d_point3d;

import java.util.Arrays;

public class TestPoint2dPoint3d {
    public static void main(String[] args) {
        Point2d point2d = new Point2d(1, 2);
        System.out.println(Arrays.toString(point2d.getXY()));
        System.out.println(point2d);

        Point3d point3d = new Point3d(5, 6, 7);
        System.out.println(Arrays.toString(point3d.getXYZ()));
        point3d.setXYZ(3,2,1);
        System.out.println(point3d);

    }
}
