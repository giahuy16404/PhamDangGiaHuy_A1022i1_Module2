package homework.ss05_static_method_static_property.practice;

public class StaticMethod {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    StaticMethod(int r,String n){
        rollno = r;
        name = n;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod s1 = new StaticMethod(111,"Huy");

        s1.display();

    }



}
