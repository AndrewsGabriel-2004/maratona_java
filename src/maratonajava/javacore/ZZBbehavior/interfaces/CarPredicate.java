package maratonajava.javacore.ZZBbehavior.interfaces;

import maratonajava.javacore.ZZBbehavior.domain.Car;

@FunctionalInterface //->only one abstract method
public interface CarPredicate {
    //anonymous class, functions(don't associated to any class) and conciser code
    boolean test(Car car); //Lambdas contract
    //(parameter) -> <expression>
    //(Car car) -> car.getColor().equals("Green")




}
