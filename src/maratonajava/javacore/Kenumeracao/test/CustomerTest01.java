package maratonajava.javacore.Kenumeracao.test;

import maratonajava.javacore.Kenumeracao.domain.CostumerType;
import maratonajava.javacore.Kenumeracao.domain.Customer;

public class CustomerTest01 {
    public static void main(String[] args){
        Customer customer1 = new Customer("Andrews G.", CostumerType.PESSOA_FISICA, Customer.paymentType.debit);
        Customer customer2 = new Customer("Andriely P.", CostumerType.PESSOA_JURIDICA, Customer.paymentType.credit);

        System.out.println(customer1);
        System.out.println(customer2);


    }
}
