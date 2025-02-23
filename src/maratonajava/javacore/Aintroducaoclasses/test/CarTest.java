package maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.javacore.Aintroducaoclasses.dominio.Car;

public class CarTest {
    public static void main(String[] args) {
       Car car = new Car();
        Car car1 = new Car();

        car.name = "Sedan";
        car.model = "Toyota";
        car.year = 1999;

        car = car1;

        car1.name = "Hb20";
        car1.model = "Chevrolet";
        car1.year = 2004;

        System.out.println("Car:" + car.name + " Model:" + car.model + " year:" + car.year);
        System.out.println("Car:" + car1.name + " Model:" + car1.model + " year:" + car1.year);

    }
}
