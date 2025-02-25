package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Car;

public class CarChallenge02 {
    public static void main(String[] args) {
        Car carPrint4 = new Car();
        Car carPrint5 = new Car();
        Car details = new Car();

        carPrint4.name = "Andrews";
        carPrint4.model = "x";
        carPrint4.year = 2000;

        details.showDetails2(carPrint4);

        //PASSAGEM DE PARAMETROS REFERENCE

    }
}
