package maratonajava.ExercisesLogicProg;

//2 - Faça um algoritmo para receber um número qualquer e
// imprimir na tela se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número qualquer: ");
        int num = sc.nextInt();

        if(num > 0){System.out.println(num + " é positivo");
        }else {System.out.println(num + " é negativo");}

        if(num % 2 == 0){System.out.println(num + " é par");
        }else {System.out.println(num + " é ímpar");}

    }
}
