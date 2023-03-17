package furama_final.models;

public class Contract {
    private String codeContract;
    private String codeBooking;
    private double depositInAdvance;
    private double totalMoney;
    private String codeCustomer;

    public Contract(String codeContract, String codeBooking, double depositInAdvance, double totalMoney, String codeCustomer) {
        this.codeContract = codeContract;
        this.codeBooking = codeBooking;
        this.depositInAdvance = depositInAdvance;
        this.totalMoney = totalMoney;
        this.codeCustomer = codeCustomer;
    }

    public Contract(){

    }

    public String getCodeContract() {
        return codeContract;
    }

    public void setCodeContract(String codeContract) {
        this.codeContract = codeContract;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public double getDepositInAdvance() {
        return depositInAdvance;
    }

    public void setDepositInAdvance(double depositInAdvance) {
        this.depositInAdvance = depositInAdvance;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "codeContract=" + codeContract +
                ", codeBooking=" + codeBooking +
                ", depositInAdvance=" + depositInAdvance +
                ", totalMoney=" + totalMoney +
                ", codeCustomer=" + codeCustomer +
                '}';
    }
}
