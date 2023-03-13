package furama_test.services;

import furama_test.models.Employee;

public interface EmployeeService extends Service {
    @Override
    void displayService();


    void addServiceEmployees(Employee employee);


    @Override
    void editService();

    void addService();

}
