package furama_final.models;

public class Villa extends Facility {
    private String roomStandard;
    private int swimmingPoolArea;
    private int numberOfFloors;

    public Villa() {

    }

    public Villa(String idService,String serviceName, int usableArea, int rentalCosts, int numberOfPeople,
                 String rentalType, String roomStandard, int swimmingPoolArea, int numberOfFloors) {
        super(idService,serviceName, usableArea, rentalCosts, numberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String roomStandard, int swimmingPoolArea, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(int swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villar{" +
                "tên phòng ='" + getServiceName() + '\'' +
                ", swimmingPoolArea=" + swimmingPoolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
