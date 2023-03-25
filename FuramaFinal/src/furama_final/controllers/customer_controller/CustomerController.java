package furama_final.controllers.customer_controller;

import furama_final.models.Customer;
import furama_final.services.impl.CustomerServiceImpl;

import java.io.IOException;

public class CustomerController {
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    public void add(Customer customer) throws IOException {
        customerService.add(customer);
    }

    public void display() throws IOException {
        customerService.display();
    }

    public void edit(String id) throws IOException {
        customerService.edit(id);
    }
}
