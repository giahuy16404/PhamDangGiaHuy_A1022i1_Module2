package furama_test.services.impl;

import furama_test.models.Customer;
import furama_test.services.CustomerService;

import java.util.LinkedList;

public class CustomerServiceImpl implements CustomerService {
    LinkedList<Customer> linkedList = new LinkedList<>();

    public void displayCustomer() {
        for (Customer customer : linkedList) {
            System.out.println(customer);
        }
    }

    public boolean checkIdCustoer(String id){
        boolean check = false;
        for (Customer customer : linkedList) {
            if (customer.getCode().equals(id)) {
                check = true;
                break;
            }
        }
        return check;
    }

    public Customer editCustomer(String id){
        Customer check = null;
        for (Customer customer : linkedList) {
            if (customer.getCode().equals(id)) {
                check = customer;
            }
        }
        return check;
    }
    public void addCustomer(Customer o){
        linkedList.add(o);
    }
    @Override
    public void displayService() {

    }

    @Override
    public void addService() {

    }

    @Override
    public void editService() {

    }
}
