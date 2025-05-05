package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Zgenerics.Service.BoatService;
import maratonajava.javacore.Zgenerics.Service.RentableCarService;
import maratonajava.javacore.Zgenerics.domain.Boat;
import maratonajava.javacore.Zgenerics.domain.Car;

public class GenericClassTest01 {
    public static void main(String[] args) {
        RentableCarService carService = new RentableCarService();
        Car car = carService.retrieveAvailableCar();
        System.out.println("Using the car for 1 month");
        carService.returnRentCar(car);

        BoatService boatService = new BoatService();
        Boat boat = boatService.retrieveAvailableBoat();
        System.out.println("Using the boat for 1 month");
        boatService.returnRentBoat(boat);
    }
}
