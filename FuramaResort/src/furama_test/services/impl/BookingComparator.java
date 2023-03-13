package furama_one.services.impl;

import furama_one.models.Booking;

import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
       if (o1.getStarDay() < o2.getStarDay()){
           return +1;
       }else if (o1.getStarDay() > o2.getStarDay()){
           return -1;
       }else {
           if (o1.getEndDay() > o2.getEndDay()){
               return +1;
           }else if (o1.getEndDay() < o2.getEndDay()){
               return -1;
           }else {
               return 0;
           }
       }
    }
}
