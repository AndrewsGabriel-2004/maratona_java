package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee funcionary = new Employee();

        funcionary.name = "Selena";
        funcionary.age = 20;
        funcionary.salary = new double[]{2000,3000,7000};

        funcionary.showDetails();
    }
}
