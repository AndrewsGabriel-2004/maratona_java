package maratonajava.javacore.Fmodificadoresstatics.test;

import maratonajava.javacore.Fmodificadoresstatics.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 280);
        Car c2 = new Car("Mercedes", 275);
        Car c3 = new Car("Audi", 290);
        System.out.println(Car.velocityLimit);
        Car.velocityLimit = 180; //depois do static, velocidade limit esta para a CLASSE
        System.out.println(Car.velocityLimit);
        c1.print();
        c2.print();
       c3.print();

    }
}
