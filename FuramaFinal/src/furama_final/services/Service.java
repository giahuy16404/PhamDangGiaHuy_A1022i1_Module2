package furama_final.services;

import java.io.IOException;

public interface Service {
     void display() throws IOException;
     void add(Object o) throws IOException;
     void edit(String id) throws IOException;

}
