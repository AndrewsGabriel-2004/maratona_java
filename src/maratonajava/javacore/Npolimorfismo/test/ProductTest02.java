package maratonajava.javacore.Npolimorfismo.test;

import maratonajava.javacore.Npolimorfismo.domain.Computer;
import maratonajava.javacore.Npolimorfismo.domain.Product;
import maratonajava.javacore.Npolimorfismo.domain.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 3000);
        System.out.println(product.getName());
        System.out.println(product.getValue());
        System.out.println(product.calculateTax());
        System.out.println("--------------");
        Product product2 = new Tomato("American",20);
        System.out.println(product2.getName());
        System.out.println(product2.getValue());
        System.out.println(product2.calculateTax());


    }
}
