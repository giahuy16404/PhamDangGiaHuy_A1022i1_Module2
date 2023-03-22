package furama_final.controllers.booking_controller;

import furama_final.services.impl.BookingServiceImpl;

public class BookingController {
    BookingServiceImpl bookingService = new BookingServiceImpl();
    public void add (Object o ){
        bookingService.add(o);
    }

    public void display(){
        bookingService.display();
    }


}
