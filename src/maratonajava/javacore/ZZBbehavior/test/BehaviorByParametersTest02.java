package maratonajava.javacore.ZZBbehavior.test;

import maratonajava.javacore.ZZBbehavior.domain.Car;
import maratonajava.javacore.ZZBbehavior.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorByParametersTest02 {
    private static List<Car> cars = List.of(new Car("green", 2011),new Car("green", 2012),new Car("green", 2017), new Car("green", 2010),new Car("blue", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green");
            }
        });
        System.out.println(greenCars);

        System.out.println("=============");

        List<Car> yearCars = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getYear() > 2010;
            }
        });
        System.out.println(yearCars);

        //List<Car> greenCars = filter(cars,car -> car.getColor().equals("green"));
        //List<Car> yearCars = filter(cars,car -> car.getYear() > 2010);

        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println(filterWithPredicate(nums, e->(e % 2)==0));
    }

    private static <T> List<T> filterWithPredicate(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T e: list){
            if(predicate.test(e)){
                filteredList.add(e);
            }
        }

        return filteredList;
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if(carPredicate.test(car)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

}
