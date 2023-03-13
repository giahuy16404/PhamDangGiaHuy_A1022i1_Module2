package furama_one.services;

import furama_one.models.Employee;

public interface EmployeeService extends Service {
    @Override
    void displayService();


    void addServiceEmployees(Employee employee);


    @Override
    void editService();

    void addService();

}
