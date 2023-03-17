package furama_final.controllers.employee_controller;

import furama_final.models.Employee;
import furama_final.services.EmployeeService;
import furama_final.services.impl.EmployeeServiceImpl;

public class EmployeeController {
    EmployeeService employeeService = new EmployeeServiceImpl();
    public void add(Employee employee) {
        employeeService.add(employee);
    }

    public void display() {
        employeeService.display();
    }

    public void edit(String id) {
        employeeService.edit(id);
    }

}
