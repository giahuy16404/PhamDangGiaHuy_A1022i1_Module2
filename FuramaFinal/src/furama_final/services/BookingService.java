package furama_final.services;

import furama_final.models.Contract;

import java.io.IOException;

public interface BookingService extends Service {



    @Override
    void display();

    @Override
    void add(Object o) throws IOException;

    @Override
    void edit(String id);
}
