package maratonajava.javacore.Jmodificadorfinal.domain;

public class Buyer {
    private String name;

    @Override
    public String toString() {
        return this.name;
    }

    //getter e setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
