package furama_final.services;

import furama_final.models.Contract;

public interface BookingService extends Service {


    void createNewConstracts(Contract o);

    void displayListContracts();

    @Override
    void display();

    @Override
    void add(Object o);

    @Override
    void edit(String id);
}
