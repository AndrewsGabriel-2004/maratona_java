package maratonajava.javacore.Lclassesabstratas.test;

import maratonajava.javacore.Lclassesabstratas.domain.Developer;
import maratonajava.javacore.Lclassesabstratas.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Nami", 10000);
        manager.print();
        System.out.println(manager);
        Developer developer = new Developer("Luffy", 5000);
        developer.print();
        System.out.println(developer);
    }
}
