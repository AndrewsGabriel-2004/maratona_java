package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Zgenerics.Service.RentalService;
import maratonajava.javacore.Zgenerics.domain.Boat;
import maratonajava.javacore.Zgenerics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class GenericClassTest03 {
    public static void main(String[] args) {
        List<Car> disponibleCars = new ArrayList<>(List.of(new Car("BMW"), new Car("Fusca")));
        List<Boat> disponibleBoat = new ArrayList<>(List.of(new Boat("Lancha"), new Boat("Barco")));

        RentalService<Car> rentalServiceCar = new RentalService<>(disponibleCars);
        Car car = rentalServiceCar.retrieveAvailableObject();
        System.out.println("Using car for 1 month");
        rentalServiceCar.returnRentObject(car);

        System.out.println();
        System.out.println("================");
        System.out.println();

        RentalService<Boat> rentalServiceBoat = new RentalService<>(disponibleBoat);
        Boat boat = rentalServiceBoat.retrieveAvailableObject();
        System.out.println("Using boat for 1 month");
        rentalServiceBoat.returnRentObject(boat);
    }
}


