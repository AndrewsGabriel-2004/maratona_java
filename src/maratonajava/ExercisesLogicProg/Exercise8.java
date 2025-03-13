package maratonajava.ExercisesLogicProg;

//8 - Faça um algoritmo que leia três valores inteiros diferentes e im
// prima na tela os valores em ordem decrescente.

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Imprima o valor 1: ");
        int num1 = sc.nextInt();
        System.out.print("Imprima o valor 2: ");
        int num2 = sc.nextInt();
        System.out.print("Imprima o valor 3: ");
        int num3 = sc.nextInt();

        int[] numeros = new int[]{num1,num2,num3};
        Arrays.sort(numeros);

        for(int i = 2; i >= 0; i--){
            System.out.print(numeros[i] + " ");
        }

    }
}
