package maratonajava.javacore.Kenumeracao.domain;

public class Customer {
    private String name;
    private CostumerType customerTp;
    private PaymentType paymentType;

    //constructor
    public Customer(String name, CostumerType customerTp, PaymentType paymentType) {
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
