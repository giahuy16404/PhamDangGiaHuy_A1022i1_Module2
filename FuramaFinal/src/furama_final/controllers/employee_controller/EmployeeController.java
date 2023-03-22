package furama_final.controllers.employee_controller;

import furama_final.models.Employee;
import furama_final.services.EmployeeService;
import furama_final.services.impl.EmployeeServiceImpl;

import java.io.IOException;

public class EmployeeController {
    EmployeeService employeeService = new EmployeeServiceImpl();
    public void add(Employee employee) throws IOException {
        employeeService.add(employee);
    }

    public void display() throws IOException {
        employeeService.display();
    }

    public void edit(String id) throws IOException {
        employeeService.edit(id);
    }

}
