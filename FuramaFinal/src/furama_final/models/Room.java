package furama_final.models;

public class Room extends Facility{
    private String freeService;

    public Room(String idService,String serviceName, int usableArea, int rentalCosts, int numberOfPeople, String rentalType, String freeService) {
        super(idService,serviceName, usableArea, rentalCosts, numberOfPeople, rentalType);
        this.freeService = freeService;
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }
    public Room(){}

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "tên phòng ='" + getServiceName() + '\'' +
                '}';
    }
}
