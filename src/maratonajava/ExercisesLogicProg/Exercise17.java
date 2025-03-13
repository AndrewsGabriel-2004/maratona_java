package maratonajava.ExercisesLogicProg;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em grau Fahrenheit: ");
        double tempInicial = sc.nextDouble();

        double temperaturaCelsius = (5 * (tempInicial - 32)/9);
        String result = String.format("%.2f", temperaturaCelsius);

        System.out.println("Temp em Fahreinheit: "+ tempInicial+ "Fº.");
        System.out.println("Temp em Celsius: "+ result + "Cº.");

    }
}
