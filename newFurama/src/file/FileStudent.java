package file;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileStudent {
    private static final String FILE_STUDENT = "D:\\CODEGYM\\Module2\\newFurama\\src\\file\\fileStudent.csv";
    public static void write(List<Student> students) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_STUDENT);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Student student :students) {
            bufferedWriter.write(student.getName()+","+student.getDate()+","+student.getGender()+","+student.getId()+","+
                    student.getNameClass()+","+student.getDiemTrungBinh()+"\n");
        }
        bufferedWriter.close();
    }

    public static List<Student> read() throws IOException {
        FileReader fileReader = new FileReader(FILE_STUDENT);
        BufferedReader  bufferedReader = new BufferedReader(fileReader);
        List<Student> list = new ArrayList<>();
        String line ;
        String[] temp;
        Student student;
        while ((line = bufferedReader.readLine()) != null){
            temp = line.split(",");
            String name = temp[0];
            String date = temp[1];
            String gender = temp[2];
            String id = temp[3];
            String nameClass = temp[4];
            int diem = Integer.parseInt(temp[5]);
         student =   new Student(name,date,gender,id,nameClass,diem);
         list.add(student);
        }
        bufferedReader.close();
        return list;
    }
}
