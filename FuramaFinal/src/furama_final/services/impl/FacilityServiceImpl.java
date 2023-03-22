package furama_final.services.impl;

import furama_final.models.*;
import furama_final.services.FacilityService;

import java.util.LinkedHashMap;

public class FacilityServiceImpl implements FacilityService {
    public static LinkedHashMap<Facility, Integer> linkedHashMap = new LinkedHashMap<>();

    @Override
    public void add(Object o) {
        linkedHashMap.put((Facility) o,0);
    }


    @Override
    public void display() {
        for (Facility key : linkedHashMap.keySet()) {
            if (linkedHashMap.get(key) >= 5) {
                System.out.println(key + " : Cần được bảo trì!");
            } else {
                System.out.println(key + " = " + linkedHashMap.get(key));
            }
        }
    }

    public void displayListMaintenance() {
        for (Facility key : linkedHashMap.keySet()) {
            if (linkedHashMap.get(key) >= 5) {
                System.out.println(key + " : Cần được bảo trì!");
            }
        }
    }

    @Override
    public void edit(String id) {

    }
}
