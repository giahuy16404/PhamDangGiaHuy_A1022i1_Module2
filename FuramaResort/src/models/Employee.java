package models;

public class Employee extends Person {
    private String level;
    private String location;
    private double Wage;

    public Employee(String code, String name, String dateOfBirth, String gender, int citizenIdentification,
                    int phoneNumber, String email, String address, String level, String location, double wage) {
        super(code, name, dateOfBirth, gender, citizenIdentification, phoneNumber, email, address);
        this.level = level;
        this.location = location;
        Wage = wage;
    }

    public Employee(String level, String location, double wage) {
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

    public double getWage() {
        return Wage;
    }

    public void setWage(double wage) {
        Wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name: "+ this.getName()+
                "level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", Wage=" + Wage +
                '}';
    }
}
