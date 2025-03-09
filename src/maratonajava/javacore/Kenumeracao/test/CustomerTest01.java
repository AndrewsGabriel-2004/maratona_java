package maratonajava.javacore.Kenumeracao.test;

import maratonajava.javacore.Kenumeracao.domain.CostumerType;
import maratonajava.javacore.Kenumeracao.domain.Customer;
import maratonajava.javacore.Kenumeracao.domain.PaymentType;

public class CustomerTest01 {
    public static void main(String[] args){
        Customer customer1 = new Customer("Andrews G.", CostumerType.PESSOA_FISICA, PaymentType.credit);
        Customer customer2 = new Customer("Andriely P.", CostumerType.PESSOA_JURIDICA, PaymentType.debit);

        System.out.println(customer1);
        System.out.println(customer2);

        System.out.println(PaymentType.debit.calculateSetOff(100));
        System.out.println(PaymentType.credit.calculateSetOff(100));

    }
}
