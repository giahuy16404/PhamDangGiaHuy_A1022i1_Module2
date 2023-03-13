package furama_test.models;

public class Customer extends Person{
    private String typeOfGuest;

    public Customer(String code, String name, String dateOfBirth, String gender,
                    int citizenIdentification, int phoneNumber, String email, String address, String typeOfGuest) {
        super(code, name, dateOfBirth, gender, citizenIdentification, phoneNumber, email, address);
        this.typeOfGuest = typeOfGuest;
    }

    public Customer(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }
    public Customer(){

    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "typeOfGuest='" + typeOfGuest + '\'' +
                '}';
    }
}
