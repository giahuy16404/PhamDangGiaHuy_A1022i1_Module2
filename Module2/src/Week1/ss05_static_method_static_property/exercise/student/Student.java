package Week1.ss05_static_method_static_property.exercise.student;

public class Student {
    private String name = "john";
    private String classes = "C02";

    public Student() {
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " " + classes;
    }


}
