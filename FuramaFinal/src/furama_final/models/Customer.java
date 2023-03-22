package furama_final.models;

import java.time.LocalDate;

public class Customer extends Person{
    private String typeOfGuest;

    public Customer(String code, String name, LocalDate dateOfBirth, String gender,
                    String citizenIdentification, String phoneNumber, String email, String address, String typeOfGuest) {
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
                "Mã khách hàng  = '" + getCode() + '\'' +
                '}';
    }
}
