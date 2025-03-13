package maratonajava.ExercisesLogicProg;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor dos 3 lados do triângulo: ");
        System.out.print("Valor do lado 1: ");
        double lado1 = sc.nextDouble();
        System.out.print("Valor do lado 2: ");
        double lado2 = sc.nextDouble();
        System.out.print("Valor do lado 3: ");
        double lado3 = sc.nextDouble();
        double[] lados = new double[]{lado1, lado2, lado3};
        Arrays.sort(lados); //crescente

        if (lados[0] + lados[1] <= lados[2]) {
            System.out.println("Esse Triângulo não existe por conta de uma condição básica. Reveja os valores!");
            return;
        }

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triângulo Equilátero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            System.out.println("Triângulo Isósceles");
        } else {
            System.out.println("Triângulo Escaleno");
        }

    }
}
