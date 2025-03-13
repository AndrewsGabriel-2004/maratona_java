package maratonajava.ExercisesLogicProg;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor da hora de Trabalho: ");
        int horaTrabalhoValue = sc.nextInt();
        System.out.print("Número de horas trabalhadas no mês: ");
        int hTrabalhada = sc.nextInt();
        System.out.print("Percentual de desconto do INSS: ");
        double descontoInss = sc.nextDouble();

        double result = descontoInss/100;

        Double salarioLiquido = (horaTrabalhoValue * hTrabalhada) * (1-result);

        System.out.println("salário liquido: "+ salarioLiquido);

    }
}
