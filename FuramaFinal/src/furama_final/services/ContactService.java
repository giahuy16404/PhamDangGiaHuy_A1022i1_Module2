package furama_final.services;

public interface ContactService extends Service{


    void displayGetVoucher();

    @Override
    void display();

    @Override
    void add(Object o);

    @Override
    void edit(String id);
}
