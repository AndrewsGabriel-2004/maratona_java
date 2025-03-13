package maratonajava.ExercisesLogicProg;

//Faça um algoritmo que leia três notas obtidas
// por um aluno, e imprima na tela a média das notas.


import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = sc.nextDouble();

        double soma = n1 + n2 + n3;
        double media = soma / 3;

        String result = String.format("%.2f", media);

        System.out.println("Média: "+ result);
    }
}
