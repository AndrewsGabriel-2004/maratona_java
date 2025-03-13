package maratonajava.ExercisesLogicProg;

//6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número qualquer: ");
        double num = sc.nextDouble();

        double result = num * 1.05;
        String resultSout = String.format("%.2f", result);
        System.out.println("Resultado do ajuste: "+ resultSout);

    }
}
