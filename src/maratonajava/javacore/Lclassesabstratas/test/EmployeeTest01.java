package maratonajava.javacore.Lclassesabstratas.test;

import maratonajava.javacore.Lclassesabstratas.domain.Developer;
import maratonajava.javacore.Lclassesabstratas.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Nami", 10000);
        System.out.println(manager);
        Developer developer = new Developer("Luffy", 4500);
        System.out.println(developer);
    }
}
