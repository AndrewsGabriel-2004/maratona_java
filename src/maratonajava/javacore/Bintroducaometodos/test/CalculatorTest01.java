package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); //method
        calculator.lessTwoNumbers();
        System.out.println("Finishing Calculator test01");

        int resultAddition = calculator.addTwoNumbers(10,10);
        System.out.println(resultAddition);
    }
}
