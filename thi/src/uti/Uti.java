package uti;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Uti {
    public static LocalDate checkInOut(String birthDay) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = null;
        try {
            date = LocalDate.parse(birthDay, formatter);
        }catch (DateTimeParseException e){
            System.out.println("Sai định dạng ngày : dd/MM/yyyy  ");
            e.printStackTrace();
        }
        return date;
    }
}
