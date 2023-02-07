package Week1.ss06_inheritance.exercise.circle_cylinder;

public class TestCircleCylinder {
    public static void main(String[] args) {
        Circle circle = new Cylinder("Blue",12,5);
        System.out.println(circle.acreageCircle());
        System.out.println(circle);

        Cylinder cylinder =  new Cylinder("blue",12,2);
        System.out.println(cylinder.volumeCylinder());
        System.out.println(cylinder);


    }
}
