package furama_final.services;

import java.io.IOException;

public interface CustomerService extends Service{
    @Override
    void display() throws IOException;

    @Override
    void add(Object o) throws IOException;

    @Override
    void edit(String id) throws IOException;
}
