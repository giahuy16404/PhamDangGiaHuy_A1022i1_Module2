package furama_one.services.impl;

import furama_one.models.*;
import furama_one.services.FacilityService;

import java.util.LinkedHashMap;

public class FacilityServiceImpl implements FacilityService {
    LinkedHashMap<Facility, Integer> linkedHashMap = new LinkedHashMap<>();
    int useRoom = 0;
    int useVillar = 0;
    int useHouse = 0;

    public void addServiceVillar(Villar o) {
        useVillar++;
        linkedHashMap.put(o, useVillar);
    }

    public void addServiceHouse(House o) {
        useHouse++;
        linkedHashMap.put(o, useHouse);

    }

    public void addServiceRoom(Room o) {
        useRoom++;
        linkedHashMap.put(o, useRoom);
    }

    public void displayServiceFacility() {
        for (Facility key : linkedHashMap.keySet()) {
            if (linkedHashMap.get(key) >= 5) {
                System.out.println(key + " : Cần được bảo trì!");
            } else {
                System.out.println(key + " = " + linkedHashMap.get(key));
            }
        }
    }

    public void displayFacilityMaintenance() {
        for (Facility key : linkedHashMap.keySet()) {
            if (linkedHashMap.get(key) >= 5) {
                System.out.println(key + " : Cần được bảo trì!");
            }
        }
    }

    @Override
    public void displayService() {

    }

    @Override
    public void addService() {

    }

    @Override
    public void editService() {

    }
}
