package furama_final.models;

public class Booking {
    private String codeBooking;
    private int starDay;
    private int endDay;
    private String codeCustomer;
    private String serviceName;
    private String typeOfService;

    public Booking(String codeBooking, int starDay, int endDay, String codeCustomer, String serviceName, String typeOfService) {
        this.codeBooking = codeBooking;
        this.starDay = starDay;
        this.endDay = endDay;
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

    public int getStarDay() {
        return starDay;
    }

    public void setStarDay(int  starDay) {
        this.starDay = starDay;
    }

    public int getEndDay() {
        return endDay;
    }

    public void setEndDay(int endDay) {
        this.endDay = endDay;
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
                ", starDay=" + starDay +
                ", endDay=" + endDay +
                ", codeCustomer=" + codeCustomer +
                ", serviceName='" + serviceName + '\'' +
                ", typeOfService='" + typeOfService + '\'' +
                '}';
    }
}
