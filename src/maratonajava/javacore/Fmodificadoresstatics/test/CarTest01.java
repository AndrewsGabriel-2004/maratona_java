package maratonajava.javacore.Fmodificadoresstatics.test;

import maratonajava.javacore.Fmodificadoresstatics.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {

        Car.setVelocityLimit(180);
        Car c1 = new Car("BMW", 280);
        Car c2 = new Car("Mercedes", 275);
        Car c3 = new Car("Audi", 290);


        c1.print();
        c2.print();
        c3.print();

    }
}
