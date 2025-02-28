package maratonajava.javacore.Fmodificadoresstatics.domain;

public class Car {
    private String name;
    private double velocityMax;
    private static double velocityLimit = 250; //está associado a CLASSE CARRO, não a instância(atributo de cada objeto)

    public Car(String name, double velocityMax) {
        this.name = name;
        this.velocityMax = velocityMax;
    }

    public void print(){
        System.out.println("---------------");
        System.out.println("Name: " + this.name);
        System.out.println("Velocity Max: "+ this.velocityMax);
        System.out.println("Limit Velocity "+ Car.velocityLimit);

    }

    //Sets
    public void setName(String name) {
        this.name = name;
    }

    public static void setVelocityLimit(double velocityLimit) {
        Car.velocityLimit = velocityLimit;
    }

    //Gets
    public String getName() {
        return name;
    }

    public static double getVelocityLimit(){
        return Car.velocityLimit;
    }

}
