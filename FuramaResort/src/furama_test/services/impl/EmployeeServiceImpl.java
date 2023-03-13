package furama_one.services.impl;

import furama_one.models.Employee;
import furama_one.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> arrayList = new ArrayList<>();

    @Override
    public void displayService() {

    }

    public boolean checkId(String id) {
        boolean check = false;
        for (Employee employee : arrayList) {
            if (employee.getCode().equals(id)) {
                check = true;
                break;
            }
        }
        return check;
    }

    public void displayServicEmpolyees() {
        for (Employee employee : arrayList) {
            System.out.println(employee);
        }
    }

    @Override
    public void addService() {
    }

    public Employee editServiceEmployees(String id) {
        Employee editAttributeCheck = null;

        for (Employee employee : arrayList) {
            if (employee.getCode().equals(id)) {
                editAttributeCheck = employee;
            }
        }
        return editAttributeCheck;

    }

    @Override
    public void addServiceEmployees(Employee o) {
        arrayList.add(o);
    }


    @Override
    public void editService() {
    }
}
