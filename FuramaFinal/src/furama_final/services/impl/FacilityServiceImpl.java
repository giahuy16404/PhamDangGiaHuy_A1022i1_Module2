package furama_final.services.impl;

import furama_final.models.*;
import furama_final.services.FacilityService;

import java.util.LinkedHashMap;

public class FacilityServiceImpl implements FacilityService {
    static LinkedHashMap<Facility, Integer> linkedHashMap = new LinkedHashMap<>();
    int useVilla = 1;
    int useHouse = 1;
    int useRoom = 1;

    static {
        linkedHashMap.put(new Villa("Villa", 160, 120, 18,
                "1 tháng", "5 sao", 100, 8), 1);

        linkedHashMap.put(new House("House", 110, 130, 15,
                "1 năm", "4 sao", 8), 1);

        linkedHashMap.put(new Room("Room", 90, 110,
                6, "1 Ngày", "Nước suối"), 1);
    }

    @Override
    public void add(Object o) {
        if (o instanceof Villa) {
            linkedHashMap.put((Villa) o, ++useVilla);
        } else if (o instanceof House) {
            linkedHashMap.put((House) o, ++useHouse);
        } else if (o instanceof Room) {
            linkedHashMap.put((Room) o, ++useRoom);
        }
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
