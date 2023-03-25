package furama_final.services;

import java.io.IOException;

public interface FacilityService extends Service{
    @Override
    void display();

    @Override
    void add(Object o) throws IOException;

    @Override
    void edit(String id);
}
