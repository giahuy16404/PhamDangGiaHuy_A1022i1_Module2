package homework.ss16_io_text_file.exrcise.read_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader bf;
        try {
            bf = new BufferedReader(new FileReader("D:\\CODEGYM\\Module2\\Module2\\src\\homework\\ss16_io_text_file\\exrcise\\read_file\\countries.csv"));
            String line;
            while ((line = bf.readLine()) != null) {
                printCountry(splitData(line));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> splitData(String line) {
        List<String> list = new ArrayList<>();
        String[] splitString = line.split(",");
        for (int i = 0; i < splitString.length; i++) {
            list.add(splitString[i]);
        }
        return list;
    }

    static public void printCountry(List<String> list) {
        System.out.println("Country [id= "
                + list.get(0)
                + ", code= " + list.get(1)
                + " , name=" + list.get(2)
                + "]");
    }
}

