package maratonajava.javacore.ZZBbehavior.test;

import maratonajava.javacore.ZZBbehavior.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class BehaviorByParametersTest01 {
    private static List<Car> cars = List.of(new Car("green", 2011),new Car("green", 2012),new Car("green", 2017), new Car("green", 2010),new Car("blue", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        //System.out.println(filterGreenCar(cars));
        //System.out.println(filterRedCar(cars));
        System.out.println(filterCarByColor(cars, "green"));
        System.out.println(filterCarByColor(cars, "black"));
        System.out.println(filterCarByYearBefore(cars,2015));
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> carList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                carList.add(car);
            }
        }
        return carList;
    }

    private static List<Car> filterCarByYearBefore(List<Car> cars, int year) {
        List<Car> carList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                carList.add(car);
            }
        }
        return carList;
    }
}
