package furama_test.services;

import furama_test.models.Contract;

public interface BookingService extends Service {
    @Override
    void displayService();

    @Override
    void addService();

    void createNewConstracts(Contract o);

    void displayListContracts();

    @Override
    void editService();
}
