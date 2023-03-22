package furama_final.models;

import java.time.LocalDate;

public class Employee extends Person {
    private String level;
    private String location;
    private String Wage;

    public Employee(String code, String name, String dateOfBirth, String gender, String citizenIdentification,
                    String phoneNumber, String email, String address, String level, String location, String wage) {
        super(code, name, dateOfBirth, gender, citizenIdentification, phoneNumber, email, address);
        this.level = level;
        this.location = location;
        Wage = wage;
    }

    public Employee(String level, String location, String wage) {
        this.level = level;
        this.location = location;
        Wage = wage;
    }

    public Employee(){}

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWage() {
        return Wage;
    }

    public void setWage(String wage) {
        Wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "mã nhân viên : "+ getCode()+
                "level= '" + level + '\'' +
                ", location= '" + location + '\'' +
                ", Wage= " + Wage +
                '}';
    }
}
