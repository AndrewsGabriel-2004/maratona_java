package maratonajava.ExercisePOO;

import maratonajava.ExercisePOO.domain.NumeroPrimo;

import java.util.Scanner;

public class CalculadoraPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número para validação: ");
        int num = sc.nextInt();

        NumeroPrimo.validationNumber(num);


    }
}
