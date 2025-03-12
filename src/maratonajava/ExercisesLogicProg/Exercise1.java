package maratonajava.ExercisesLogicProg;

//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = sc.nextInt();
        System.out.print("Digite o valor de C: ");
        int C = sc.nextInt();
        System.out.println();
        System.out.println("Somando A e B... ");
        int soma = A + B;
        System.out.println("soma: "+soma);
        if(soma < C){
            System.out.println("A soma de A e B é menor que C");
            System.out.println("Fim.");
        }if(soma >= C){
            System.out.println("Fim.");
        }


    }
}
