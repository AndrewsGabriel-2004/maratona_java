package maratonajava.ExercisesLogicProg;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Peso: ");
        double peso = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);


        if (imc <= 18.5){System.out.print("Abaixo do peso");}
        if (imc > 18.5 && imc <= 24.9) {System.out.print("Peso ideal (parabéns)");}
        if (imc > 24.9 && imc <= 29.9) {System.out.print("Levemente acima do peso");}
        if (imc > 29.9 && imc <= 34.9) {System.out.print("Obesidade grau I");}
        if (imc > 34.9 && imc <= 39.9) {System.out.print("Obesidade grau II (severa)");}
        if (imc >= 40) {System.out.println("Obesidade grau III (mórbida)");}

    }
}
