package maratonajava.javacore.Zgenerics.Service;

import maratonajava.javacore.Zgenerics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class RentableCarService {
    private List<Car> disponibleCars = new ArrayList<>(List.of(new Car("Lancha"), new Car("Iate")));

    public Car retrieveAvailableCar(){
        System.out.println("Finding available car");
        Car car = disponibleCars.remove(0);
        System.out.println("Renting Car: "+ car);
        System.out.print("Disponible cars for rent: ");
        System.out.println(disponibleCars);
        return car;
    }
    public void returnRentCar(Car car){
        System.out.println("Returning rent car: "+car);
        disponibleCars.add(car);
        System.out.println("Disponible cars for rent: ");
        System.out.print(disponibleCars);
    }

}
