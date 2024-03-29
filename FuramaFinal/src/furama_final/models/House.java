package furama_final.models;

public class House extends Facility {
    private String styleStandard;
    private int numberOfFloors;

    public House(String idService,String serviceName, int usableArea, int rentalCosts, int numberOfPeople,
                 String rentalType, String styleStandard, int numberOfFloors) {
        super(idService,serviceName, usableArea, rentalCosts, numberOfPeople, rentalType);
        this.styleStandard = styleStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String styleStandard, int numberOfFloors) {
        this.styleStandard = styleStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House() {
    }

    public String getStyleStandard() {
        return styleStandard;
    }

    public void setStyleStandard(String styleStandard) {
        this.styleStandard = styleStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "ten phong = '" + getServiceName() + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
