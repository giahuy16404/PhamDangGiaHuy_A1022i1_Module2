package furama_final.services;

import java.io.IOException;

public interface EmployeeService extends Service {



    void add(Object o) throws IOException;

    void edit(String id) throws IOException;
    void display() throws IOException;





}
