package service;

import model.Student;

import java.io.IOException;
import java.util.List;

public interface Istudent {
    void display();
    void add(Object o) throws IOException;
    void edit(String id, Object o);
    void delete(String id);
    void timTheoTen(String id);
    void caoDenThap();
    void thapDenCao();
}
