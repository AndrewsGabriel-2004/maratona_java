package maratonajava.javacore.Npolimorfismo.service;

import maratonajava.javacore.Npolimorfismo.domain.Computer;
import maratonajava.javacore.Npolimorfismo.domain.Product;
import maratonajava.javacore.Npolimorfismo.domain.Tomato;

public class CalculatorTax {
    public static void calculateTax(Product product){
        System.out.println("Relatory Tax: ");
        double tax = product.calculateTax();
        System.out.println("Product: " + product.getName());
        System.out.println("Value: "+ product.getValue());
        System.out.println("Product Tax: "+ tax);
        if(product instanceof Tomato){
        Tomato tomato = (Tomato) product; //specific to generic
        System.out.println("Expiratin Data: " +tomato.getExpirationData());
        }
    }
}
