package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.EmployeeGPT;

public class EmployeeTestGPT {
    public static void main(String[] args) {
        EmployeeGPT funcionary = new EmployeeGPT();

        funcionary.setName("Selena");
        funcionary.setAge(20);
        funcionary.setSalary(new double[]{3000,2000,5000});

        funcionary.showDetails();

        //or

        System.out.println(funcionary.getName());
        System.out.println(funcionary.getAge());
        System.out.println(funcionary.getAverage());
    }
}
