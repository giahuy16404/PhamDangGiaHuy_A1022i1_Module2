package furama_final.models;

import java.time.LocalDate;

public abstract class Person {
    private String code;
    private String name;
    private LocalDate dateOfBirth;
    private String gender;
    private String CitizenIdentification;
    private String phoneNumber;
    private String email;
    private String address;

    public Person(String code, String name, LocalDate dateOfBirth, String gender,
                  String citizenIdentification, String phoneNumber, String email, String address) {
        this.code = code;
        this.name = name;
        this.gender = gender;
        this.CitizenIdentification = citizenIdentification;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }
    public Person(){}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCitizenIdentification() {
        return CitizenIdentification;
    }

    public void setCitizenIdentification(String citizenIdentification) {
        CitizenIdentification = citizenIdentification;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", CitizenIdentification=" + CitizenIdentification +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
