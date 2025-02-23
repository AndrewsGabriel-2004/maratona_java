package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int number1 =1;
        int number2 =2;
        calculator.transformTwoNumbers(number1,number2);
        System.out.println(number1);
        System.out.println(number2);

    }
}
