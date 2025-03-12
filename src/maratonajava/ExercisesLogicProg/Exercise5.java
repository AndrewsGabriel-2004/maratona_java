package maratonajava.ExercisesLogicProg;

//5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu salário? ");
        int salario = sc.nextInt();
        double qntd = salario/1923.20;
        String result = String.format("%.3f", qntd);
        System.out.println("Você recebe "+ result+ " salários mínimos.");
    }
}
