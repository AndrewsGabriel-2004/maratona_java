package maratonajava.javacore.Jmodificadorfinal.test;

import maratonajava.javacore.Jmodificadorfinal.domain.Buyer;
import maratonajava.javacore.Jmodificadorfinal.domain.Car;
import maratonajava.javacore.Jmodificadorfinal.domain.Ferrari;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        Buyer buyer2 = new Buyer();

        System.out.println(Car.MAX_VELOCITY);
        car.BUYER.setName("Toreto");
        System.out.println(car.BUYER);

        Ferrari ferrari = new Ferrari();
        ferrari.setName("Enzo");
        ferrari.print();

    }
}
