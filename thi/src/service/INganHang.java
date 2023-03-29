package service;

import java.io.IOException;

public interface INganHang {
    void add( Object o) throws IOException;
    void remove( String ma) throws IOException;
    void display() throws IOException;
    void timKiem(String ma) throws IOException;
}
