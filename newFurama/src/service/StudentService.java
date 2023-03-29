package service;

import file.FileStudent;
import model.Student;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentService implements Istudent{
    public static List<Student> list;

    static {
        try {
            list = FileStudent.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void display() {
        for (Student student:list) {
            System.out.println(student);
        }

    }

    @Override
    public void add(Object o){
        try{

        if (o != null){
            list.add((Student) o);
            FileStudent.write(list);
        }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void edit(String id, Object o) {
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).getId().equals(id)){
                list.set(i, (Student) o);
            }
        }
        try{
            FileStudent.write(list);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public Boolean checkId(String id){
        boolean check = false;
        for (Student student:list) {
            if (student.getId().equals(id)) {
                check = true;
                break;
            }

        }
        return check;
    }

    @Override
    public void delete(String id) {
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).getId().equals(id)){
                list.remove(list.get(i));
            }
        }
        try{
            FileStudent.write(list);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void timTheoTen(String id) {

    }

    @Override
    public void caoDenThap() {
        Collections.sort(list);
        for (Student student1: list) {
            System.out.println(student1);
        }
    }


    @Override
    public void thapDenCao() {
        list.sort(Collections.reverseOrder());
        for (Student student1: list) {
            System.out.println(student1);
        }
    }
}
