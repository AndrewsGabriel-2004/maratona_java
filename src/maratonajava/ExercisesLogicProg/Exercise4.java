package maratonajava.ExercisesLogicProg;

//4 - Faça um algoritmo que receba um número
// inteiro e imprima na tela o seu antecessor e o seu sucessor.

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número qualquer: ");
        int num = sc.nextInt();

        System.out.println("Sucessor de "+num+": "+ (num+1));
        System.out.println("Antecessor de "+num+": "+ (num-1));



    }
}
