package maratonajava.javacore.Npolimorfismo.domain;

public class Tomato extends Product{
    public static final double TAXS = 0.06;
    private String expirationData;
    public Tomato(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating Tomato's Tax");
        return this.value * TAXS;
    }

    public String getExpirationData() {
        return expirationData;
    }

    public void setExpirationData(String expirationData) {
        this.expirationData = expirationData;
    }
}
