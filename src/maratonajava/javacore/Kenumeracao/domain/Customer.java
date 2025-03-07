package maratonajava.javacore.Kenumeracao.domain;

public class Customer {
    public enum paymentType {
        debit, credit
    }
    private String name;
    private CostumerType customerTp;
    private paymentType paymentType;

    //constructor
    public Customer(String name, CostumerType customerTp, paymentType paymentType) {
        this.name = name;
        this.customerTp = customerTp;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerTp=" + customerTp.getNAMERELATORY() +
                ", customerTpInt=" + customerTp.getVALUE() +
                ", paymentType=" + paymentType +
                '}';
    }
}
