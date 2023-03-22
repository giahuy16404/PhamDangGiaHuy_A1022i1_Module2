package furama_final.services.impl;

import furama_final.models.Contract;
import furama_final.services.ContactService;

import java.util.LinkedList;
import java.util.Queue;

public class ContractServiceImpl implements ContactService {
    Queue<Contract> queue = new LinkedList<>();
    @Override
    public void display() {

    }
    public void createNewConstracts(Contract o) {
        queue.add(o);
    }

    public boolean checkContract(String idCustomer) {
        boolean flagEditContract = false;
        for (Contract contract : queue) {
            if (contract.getCodeCustomer().equals(idCustomer)) {
                return flagEditContract = true;
            }
        }
        return flagEditContract;
    }

    public Contract editContrac(String idCustomer) {
        for (Contract contract : queue) {
            if (contract.getCodeCustomer().equals(idCustomer)) {
                return contract;
            }
        }
        return null;
    }

    public void displayContrac() {
        for (Contract contract : queue) {
            System.out.println(contract);
        }
    }



    @Override
    public void displayGetVoucher() {

    }

    @Override
    public void add(Object o) {

    }

    @Override
    public void edit(String id) {

    }
}
