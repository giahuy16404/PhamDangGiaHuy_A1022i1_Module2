package furama_final.services;

public interface FacilityService extends Service{
    @Override
    void display();

    @Override
    void add(Object o);

    @Override
    void edit(String id);
}
