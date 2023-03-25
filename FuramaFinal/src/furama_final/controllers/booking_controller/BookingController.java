package furama_final.controllers.booking_controller;

import furama_final.services.impl.BookingServiceImpl;

import java.io.IOException;

public class BookingController {
    BookingServiceImpl bookingService = new BookingServiceImpl();

    public BookingController() throws IOException {
    }

    public void add (Object o ) throws IOException {
        bookingService.add(o);
    }

    public void display(){
        bookingService.display();
    }


}
