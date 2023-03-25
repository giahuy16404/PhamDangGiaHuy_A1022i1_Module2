package furama_final.utility;

import furama_final.models.*;
import furama_final.services.impl.FacilityServiceImpl;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Utility {

    public static boolean birthDay(String birthDay) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date = LocalDate.now();
        try {
            date = LocalDate.parse(birthDay, formatter);
        }catch (DateTimeParseException e){
            System.out.println("Sai định dạng ngày : dd/MM/yyyy  ");
        }
        Period period = Period.between(date,LocalDate.now());

        return period.getYears() >= 18 && period.getYears() <= 100;
    }

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




    public static Facility returnFacility(String idFacility) {
        Facility facility = null;
        for (Facility key : FacilityServiceImpl.linkedHashMap.keySet()) {
            if (key != null) {
                if (key.getIdService().equals(idFacility)) {
                    facility = key;
                }
            }
        }
        return facility;
    }

    public static Boolean checkFacility(String idFacility) {
        boolean check = false;
        for (Facility key : FacilityServiceImpl.linkedHashMap.keySet()) {
            if (key.getIdService().equals(idFacility)) {
                check = true;
                break;
            }
        }
        return check;
    }


}
