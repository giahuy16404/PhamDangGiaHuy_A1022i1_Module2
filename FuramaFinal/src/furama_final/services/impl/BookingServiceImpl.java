package furama_final.services.impl;
import furama_final.models.Booking;
import furama_final.models.Contract;
import furama_final.services.BookingService;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class BookingServiceImpl implements BookingService {
    Queue<Contract> queue = new LinkedList<>();
    TreeSet<Booking> treeSet = new TreeSet<>(new BookingComparator());

    public void addServiceBooking(Booking o){
        treeSet.add(o);
    }


    public void displayServiceBooking(){
        for (Booking booking :treeSet) {
            System.out.println(booking);
        }
    }
    @Override
    public void createNewConstracts(Contract o) {
        queue.add(o);
    }

    public boolean checkContract(String idCustomer){
        boolean flagEditContract = false;
        for (Contract contract: queue) {
            if (contract.getCodeCustomer().equals(idCustomer)){
              return   flagEditContract = true;
            }
        }
        return flagEditContract;
    }

    public Contract editContrac(String idCustomer){
        for (Contract contract: queue) {
            if (contract.getCodeCustomer().equals(idCustomer)){
                return contract;
            }
        }
        return null;
    }

    public void displayContrac(){
        for (Contract contract:queue ) {
            System.out.println(queue.peek());
        }
    }


    @Override
    public void display() {
    }

    @Override
    public void add(Object o) {

    }



    @Override
    public void displayListContracts() {

    }

    @Override
    public void edit(String id) {

    }
}
