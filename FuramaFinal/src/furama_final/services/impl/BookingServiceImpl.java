package furama_final.services.impl;

import furama_final.models.Booking;
import furama_final.models.Contract;
import furama_final.models.Facility;
import furama_final.services.BookingService;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class BookingServiceImpl implements BookingService {
   public static TreeSet<Booking> treeSet = new TreeSet<>(new BookingComparator());

    @Override
    public void display() {
        for (Booking booking : treeSet) {
            System.out.println(booking);
        }
    }
    @Override
    public void add(Object o) {
        treeSet.add((Booking) o);
    }


    @Override
    public void edit(String id) {

    }
}
