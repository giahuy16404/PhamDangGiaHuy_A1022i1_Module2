package furama_test.services;

public interface ContactService extends Service{
    @Override
    void displayService();

    void displayGetVoucher();


    @Override
    void addService();

    @Override
    void editService();
}
