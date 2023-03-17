package furama_final.controllers.customer_controller;

import furama_final.models.Customer;
import furama_final.services.impl.CustomerServiceImpl;

public class CustomerController {
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    public void add(Customer customer) {
        customerService.add(customer);
    }

    public void display() {
        customerService.display();
    }

    public void edit(String id) {
        customerService.edit(id);
    }
}
