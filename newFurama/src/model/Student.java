package model;

import java.util.Collection;
import java.util.Collections;

public class Student extends Person implements Comparable<Student>{
    private String id;
    private String nameClass;
    private int diemTrungBinh;

    public Student() {
        super();
    }

    public Student(String name, String date, String gender, String id, String nameClass, int diemTrungBinh) {
        super(name, date, gender);
        this.id = id;
        this.nameClass = nameClass;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public int getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(int diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public Student(String name, String date, String gender) {
        super(name, date, gender);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", nameClass='" + nameClass + '\'' +
                ", diemTrungBinh='" + diemTrungBinh + '\'' +
                '}';
    }

    @Override
    public String show() {
        return null;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.diemTrungBinh,o.diemTrungBinh);
    }
}
