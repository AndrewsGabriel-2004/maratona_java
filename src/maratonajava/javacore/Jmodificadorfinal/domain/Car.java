package maratonajava.javacore.Jmodificadorfinal.domain;

public class Car {
    private String name;
    public static final double MAX_VELOCITY;
    public final Buyer BUYER = new Buyer(); //BUYER is the REF of the objetc Buyer, it cant be modified anytime

    static {
        MAX_VELOCITY = 250;
    }

    public final void print(){
        System.out.println(this.name);
    }

    //getter e setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
