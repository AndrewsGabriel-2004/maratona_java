package maratonajava.ExercisesLogicProg;

//7 - Faça um algoritmo que leia dois valores booleanos (lógicos)
// e determine se ambos são VERDADEIRO ou FALSO.

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mande true or false: ");
        boolean num1 = sc.nextBoolean();

        System.out.print("Mande uma condição lógica:  ");
        boolean num2 = sc.nextBoolean();

        if (num1 && num2) {
            System.out.println("Ambas são verdadeiras");
        } else if (!num1 && !num2) {
            System.out.println("Ambos são falsos");
        } else if (num1) {
            System.out.println("num1 é verdadeiro e num2 é falso");
        } else {
            System.out.println("num2 é verdadeiro e num1 é falso");
        }
    }

}

