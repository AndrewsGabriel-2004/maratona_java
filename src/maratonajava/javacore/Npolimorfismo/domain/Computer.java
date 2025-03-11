package maratonajava.javacore.Npolimorfismo.domain;

public class Computer extends Product{
    public static final double TAXS = 0.21;
    public Computer(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating Computer's Tax");
        return this.value * TAXS;
    }

}
