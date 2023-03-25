package furama_final.services.impl;

import furama_final.models.*;
import furama_final.services.FacilityService;
import furama_final.utility.MyRegex;

import java.io.*;
import java.util.LinkedHashMap;

public class FacilityServiceImpl implements FacilityService {
    public static LinkedHashMap<Facility, Integer> linkedHashMap;

    static {
        try {
            linkedHashMap = readFacility();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static final String FILE_VILLA = "D:\\CODEGYM\\Module2\\FuramaFinal\\src\\furama_final\\data\\facility_data\\villa.csv";
    private static final String FILE_HOUSE = "D:\\CODEGYM\\Module2\\FuramaFinal\\src\\furama_final\\data\\facility_data\\house.csv";
    private static final String FILE_ROOM = "D:\\CODEGYM\\Module2\\FuramaFinal\\src\\furama_final\\data\\facility_data\\room.csv";

    public static void writeFacility(LinkedHashMap<Facility, Integer> list) throws IOException {

        FileWriter fileVilla = new FileWriter(FILE_VILLA);
        FileWriter fileHouse = new FileWriter(FILE_HOUSE);
        FileWriter fileRoom = new FileWriter(FILE_ROOM);
        BufferedWriter bufferedVilla = new BufferedWriter(fileVilla);
        BufferedWriter bufferedHouse = new BufferedWriter(fileHouse);
        BufferedWriter bufferedRoom = new BufferedWriter(fileRoom);
        try {


            for (Facility facility : list.keySet()) {

                if (facility instanceof Villa) {
                    bufferedVilla.write(facility.getIdService() + "," + facility.getServiceName() + "," + facility.getUsableArea() + "," +
                            facility.getRentalCosts() + "," + facility.getNumberOfPeople() + "," + facility.getRentalType() + "," +
                            ((Villa) facility).getRoomStandard() + "," + ((Villa) facility).getSwimmingPoolArea() + "," + ((Villa) facility).getNumberOfFloors() + "\n");

                } else if (facility instanceof House) {
                    bufferedHouse.write(facility.getIdService() + "," + facility.getServiceName() + "," + facility.getUsableArea() + "," +
                            facility.getRentalCosts() + "," + facility.getNumberOfPeople() + "," + facility.getRentalType() + "," +
                            ((House) facility).getStyleStandard() + "," + ((House) facility).getNumberOfFloors() + "\n");

                } else if (facility instanceof Room) {
                    bufferedRoom.write(facility.getIdService() + "," + facility.getServiceName() + "," + facility.getUsableArea() + "," +
                            facility.getRentalCosts() + "," + facility.getNumberOfPeople() + "," + facility.getRentalType() + "," +
                            ((Room) facility).getFreeService() + "\n");
                }
            }

        } finally {
            bufferedVilla.close();
            bufferedHouse.close();
            bufferedRoom.close();
            fileVilla.close();
            fileHouse.close();
            fileRoom.close();
        }
    }
    public static LinkedHashMap<Facility, Integer> readFacility() throws IOException {

        FileReader fileVilla = new FileReader(FILE_VILLA);
        FileReader fileHouse = new FileReader(FILE_HOUSE);
        FileReader fileRoom = new FileReader(FILE_ROOM);
        BufferedReader bufferedVilla = new BufferedReader(fileVilla);
        BufferedReader bufferedHouse = new BufferedReader(fileHouse);
        BufferedReader bufferedRoom = new BufferedReader(fileRoom);
        LinkedHashMap<Facility, Integer> list = new LinkedHashMap<>();
        String line;
        String[] temp;
        Facility facility;
        try {


            while ((line = bufferedVilla.readLine()) != null) {
                temp = line.split(",");

                String id = temp[0];
                String name = temp[1];
                int area = (int) Double.parseDouble(temp[2]);
                int rentalCos = (int) Double.parseDouble(temp[3]);
                int numberOfPeople = (int) Double.parseDouble(temp[4]);
                String rentalType = temp[5];
                String roomStand = temp[6];
                int swimming = (int) Double.parseDouble(temp[7]);
                int numberOfFloor = (int) Double.parseDouble(temp[8]);
                facility = new Villa(id, name, area, rentalCos, numberOfPeople, rentalType, roomStand, swimming, numberOfFloor);
                list.put(facility, 0);

            }
            while ((line = bufferedHouse.readLine()) != null) {
                temp = line.split(",");

                String id = temp[0];
                String name = temp[1];
                int area = (int) Double.parseDouble(temp[2]);
                int rentalCos = (int) Double.parseDouble(temp[3]);
                int numberOfPeople = (int) Double.parseDouble(temp[4]);
                String rentalType = temp[5];
                String style = temp[6];
                int flow = (int) Double.parseDouble(temp[7]);
                facility = new House(id, name, area, rentalCos, numberOfPeople, rentalType, style, flow);
                list.put(facility, 0);

            }
            while ((line = bufferedRoom.readLine()) != null) {
                temp = line.split(",");

                String id = temp[0];
                String name = temp[1];
                int area = (int) Double.parseDouble(temp[2]);
                int rentalCos = (int) Double.parseDouble(temp[3]);
                int numberOfPeople = (int) Double.parseDouble(temp[4]);
                String rentalType = temp[5];
                String free = temp[6];
                facility = new Room(id, name, area, rentalCos, numberOfPeople, rentalType, free);
                list.put(facility, 0);

            }
        } finally {
            bufferedVilla.close();
            bufferedHouse.close();
            bufferedRoom.close();
            fileVilla.close();
            fileHouse.close();
            fileRoom.close();
        }

        return list;
    }

    public static void checkUseFacility(Facility o) throws IOException {
        if (o != null){
        linkedHashMap.put(o,linkedHashMap.get(o) + 1);
        writeFacility(linkedHashMap);
    }}

    public static void displayListVilla() {
        for (Facility key : linkedHashMap.keySet()) {
            if (key instanceof Villa) {
                System.out.println(key);
            }
        }
    }

    public static void displayListHouse() {
        for (Facility key : linkedHashMap.keySet()) {
            if (key instanceof House) {
                System.out.println(key);
            }
        }
    }

    public static void displayListRoom() {
        for (Facility key : linkedHashMap.keySet()) {
            if (key instanceof Room) {
                System.out.println(key);
            }
        }
    }


    @Override
    public void add(Object o) throws IOException {
        if (o != null) {
            linkedHashMap.put((Facility) o, 0);
            writeFacility(linkedHashMap);
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
