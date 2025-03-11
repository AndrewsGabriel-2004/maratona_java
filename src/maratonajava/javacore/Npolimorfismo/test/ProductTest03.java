package maratonajava.javacore.Npolimorfismo.test;

import maratonajava.javacore.Npolimorfismo.domain.Computer;
import maratonajava.javacore.Npolimorfismo.domain.Product;
import maratonajava.javacore.Npolimorfismo.domain.Tomato;
import maratonajava.javacore.Npolimorfismo.service.CalculatorTax;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 3000);
        Tomato tomato = new Tomato("American",20);
        tomato.setExpirationData("10/03/25");

        CalculatorTax.calculateTax(tomato);
        System.out.println("--------------");
        CalculatorTax.calculateTax(product);
    }
}
