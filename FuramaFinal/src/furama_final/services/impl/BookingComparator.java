package furama_final.services.impl;

import furama_final.models.Booking;

import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        int dateBooking = o2.getCheckIn().compareTo(o1.getCheckIn());
        if (dateBooking != 0) {
            return dateBooking;
        } else {
            return o2.getCheckOut().compareTo(o1.getCheckOut());
        }

    }
}
