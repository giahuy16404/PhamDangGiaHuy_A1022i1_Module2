package furama_final.utility;

import furama_final.models.*;
import furama_final.services.impl.FacilityServiceImpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

public class Utility {

    public static LocalDate formatDayMonthYear(String birthDay) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return LocalDate.parse(birthDay, formatter);
    }

    public static void displayListVilla() {
        for (Facility key : FacilityServiceImpl.linkedHashMap.keySet()) {
            if (key instanceof Villa) {
                System.out.println(key);
            }
        }
    }

    public static void displayListHouse() {
        for (Facility key : FacilityServiceImpl.linkedHashMap.keySet()) {
            if (key instanceof House) {
                System.out.println(key);
            }
        }
    }

    public static void displayListRoom() {
        for (Facility key : FacilityServiceImpl.linkedHashMap.keySet()) {
            if (key instanceof Room) {
                System.out.println(key);
            }
        }
    }

    public static Facility returnFacility(String idFacility) {
        Facility facility = null;
        for (Facility key : FacilityServiceImpl.linkedHashMap.keySet()) {
            if (key != null) {
                if (key.getServiceName().equals(idFacility)) {
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

    public static void checkUseFacility(Facility o) {
        FacilityServiceImpl.linkedHashMap.put(o, FacilityServiceImpl.linkedHashMap.get(o) + 1);
    }
}
