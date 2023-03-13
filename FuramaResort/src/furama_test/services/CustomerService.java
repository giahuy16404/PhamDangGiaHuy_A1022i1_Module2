package furama_one.services;

public interface CustomerService extends Service{
    @Override
    void displayService();

    @Override
    void addService();

    @Override
    void editService();
}
