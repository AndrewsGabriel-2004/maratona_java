package maratonajava.javacore.Npolimorfismo.test;

import maratonajava.javacore.Npolimorfismo.domain.Computer;
import maratonajava.javacore.Npolimorfismo.domain.TV;
import maratonajava.javacore.Npolimorfismo.domain.Tomato;
import maratonajava.javacore.Npolimorfismo.service.CalculatorTax;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("NUC10i7", 11000);
        Tomato tomato = new Tomato("Tomato Sciciliano", 10);
        TV tv = new TV("Samsung 50º", 5000);

        CalculatorTax.calculateTax(tomato);
        System.out.println("------------");
        CalculatorTax.calculateTax(computer);
        System.out.println("------------");
        CalculatorTax.calculateTax(tv);
    }
}
