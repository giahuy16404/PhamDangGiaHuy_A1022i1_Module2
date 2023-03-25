package furama_final.services.impl;

import furama_final.models.*;
import furama_final.services.BookingService;

import java.io.*;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class BookingServiceImpl implements BookingService {
    public  TreeSet<Booking> treeSet = readBooking();

    private static final String FILE_BOOKING = "D:\\CODEGYM\\Module2\\FuramaFinal\\src\\furama_final\\data\\booking_data\\booking.csv";

    public BookingServiceImpl() throws IOException {
    }

    public static void writeBooking(TreeSet<Booking> treeSet) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_BOOKING);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Booking booking : treeSet) {
            bufferedWriter.write(booking.getCodeBooking() + "," + booking.getCheckIn() + "," + booking.getCheckOut() + ","
                    + booking.getCodeCustomer() + "," + booking.getServiceName() + "," + booking.getTypeOfService() + "\n");
        }
        bufferedWriter.close();
    }

    public static TreeSet<Booking> readBooking() throws IOException {
        FileReader fileReader = new FileReader(FILE_BOOKING);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        TreeSet<Booking> list = new TreeSet<>(new BookingComparator());
        String line;
        String[] temp;
        Booking booking;
        while ((line = bufferedReader.readLine()) != null) {
            temp = line.split(",");
            String id = temp[0];
            LocalDate checkIn = LocalDate.parse(temp[1]);
            LocalDate checkOut = LocalDate.parse(temp[2]);
            String idCustomer = temp[3];
            String nameService = temp[4];
            String typeOfService = temp[5];
            booking = new Booking(id, checkIn, checkOut, idCustomer, nameService, typeOfService);
            list.add(booking);
        }
        bufferedReader.close();
        return list;
    }

    @Override
    public void display() {
        for (Booking booking : treeSet) {
            System.out.println(booking);
        }
    }

    @Override
    public void add(Object o) throws IOException {
        if (o instanceof Booking){
            treeSet.add((Booking) o);
            writeBooking(treeSet);
        }

    }


    @Override
    public void edit(String id) {

    }
}
