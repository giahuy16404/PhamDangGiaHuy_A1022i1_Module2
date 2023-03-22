package furama_final.models;

import java.time.LocalDate;

public class Booking {
    private String codeBooking;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private String codeCustomer;
    private String serviceName;
    private String typeOfService;

    public Booking(String codeBooking, LocalDate starDay, LocalDate endDay, String codeCustomer, String serviceName, String typeOfService) {
        this.codeBooking = codeBooking;
        this.checkIn = starDay;
        this.checkOut = endDay;
        this.codeCustomer = codeCustomer;
        this.serviceName = serviceName;
        this.typeOfService = typeOfService;
    }

    public Booking(){

    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "codeBooking=" + codeBooking +
                ", starDay=" + checkIn +
                ", endDay=" + checkOut +
                ", codeCustomer=" + codeCustomer +
                ", serviceName='" + serviceName + '\'' +
                ", typeOfService='" + typeOfService + '\'' +
                '}';
    }
}
