package maratonajava.javacore.Npolimorfismo.domain;

public abstract class Product implements Tax{
    protected String name;
    protected double value;

    public Product(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public double getValue() {
        return this.value;
    }
}
