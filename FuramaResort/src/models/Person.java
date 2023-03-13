package models;

public abstract class Person {
    private String code;
    private String name;
    private String dateOfBirth;
    private String gender;
    private int CitizenIdentification;
    private int phoneNumber;
    private String email;
    private String address;

    public Person(String code, String name, String dateOfBirth, String gender,
                  int citizenIdentification, int phoneNumber, String email, String address) {
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCitizenIdentification() {
        return CitizenIdentification;
    }

    public void setCitizenIdentification(int citizenIdentification) {
        CitizenIdentification = citizenIdentification;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
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
