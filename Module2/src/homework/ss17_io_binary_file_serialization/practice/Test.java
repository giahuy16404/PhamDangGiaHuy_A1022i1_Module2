package homework.ss17_io_binary_file_serialization.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test implements Serializable {

    public static void main(String[] args) {
        String path = "D:\\CODEGYM\\Module2\\Module2\\src\\homework\\ss17_io_binary_file_serialization\\practice\\studentFile.dat";
        List<Student> students = new ArrayList<>();
//        students.add(new Student(1, "Pham Dang Gia Huy", "Da Nang"));
//        students.add(new Student(2, "Ho Ngoc Oanh", "Da Nang"));
//        students.add(new Student(3, "Truong Thanh Truong", "Da Nang"));
//        students.add(new Student(4, "Le Quang Trieu", "Da Nang"));
//        writeStudent(path, students);
        System.out.println(readStudent(path));

    }

    public static void writeStudent(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream obs = new ObjectOutputStream(fos);
            obs.writeObject(students);
            obs.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readStudent(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}
