package furama_final.utility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utility {
    public static LocalDate formatBirthDay(String birthDay){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateOfBirth = LocalDate.parse(birthDay, formatter);
        return dateOfBirth;
    }
}
