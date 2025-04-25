package maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String brand;

    public Smartphone(String serialNumber, String brand) {
        this.serialNumber = serialNumber;
        this.brand = brand;
    }

    //reflexive: x.equals(x) is true for everything that's different null
    //symmetrical: to x and y non null, if x.equals(y)==true, so y.equals(x)==true
    //transitivity: to x,y and z non null. if x.equals(y) == true, so y.equals(z) == true ...
    //Consistence: x.equals(x) always return true if x != null
    // x.equals(null) == false
    @Override
    public boolean equals(Object obj) {
        if(obj == null){return false;}
        if(this == obj){return true;} //comparing the refs
        if(this.getClass() != obj.getClass()){return false;}
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber) && brand.equals(smartphone.brand);
    }

    // if x.equals(y) == true , y.hashCode() == x.hashCode()
    //y.hashCode() == x.hashCode() not exactly x.equals(x) == true
    //x.equals(y) == false hashCode has to be different
    //y.hashCode() != x.hashCode x.equals(y) has to be false
    @Override
    public int hashCode() {
        return serialNumber == null ?0: this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
