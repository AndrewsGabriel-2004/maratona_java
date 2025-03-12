package maratonajava.ExercisesLogicProg;

//3 - Faça um algoritmo que leia dois valores inteiros A e B
// se os valores de A e B forem iguais, deverá somar os dois valores,

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = sc.nextInt();

        int C;
        if(A == B){
            int soma = A + B;
            System.out.println("Soma: "+ soma);
            System.out.print("Digite o valor de C: ");
            C = sc.nextInt();
        }else{
            int multi = A * B;
            System.out.println("Multiplicação: "+ multi);
            System.out.print("Digite o valor de C: ");
            C = sc.nextInt();
        }

        System.out.println("Valor de C: "+ C);
    }
}
