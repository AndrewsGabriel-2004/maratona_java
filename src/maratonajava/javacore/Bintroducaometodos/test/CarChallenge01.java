package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Car;

public class CarChallenge01 {
    public static void main(String[] args) {
        Car carPrint2 = new Car();
        Car carPrint3 = new Car();
        Car newestCar = new Car();

        carPrint2.name = "Andrews";
        carPrint2.model = "Toyota";
        carPrint2.year = 2004;

        carPrint3.name = "Andrielly";
        carPrint3.model = "Volks";
        carPrint3.year = 2013;

        carPrint2.showDetails();
        carPrint3.showDetails();

        int result2 = carPrint2.calcularity(2025);
        System.out.println("The car "+carPrint2.name+ " has "+ result2+ "years." );

        int result3 = carPrint3.calcularity(2025);
        System.out.println("The car "+carPrint3.name+ " has "+ result3+ "years." );

        newestCar.newest(carPrint2.year, carPrint3.year);


    }
}
