package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double result = calculator.partTwoNumbers(20,0);
        System.out.println(result);                            //sem void

      calculator.printPartTwoNumbers02(20,0);
      calculator.printPartTwoNumbers02(20,25);                  //com void

    }
}
