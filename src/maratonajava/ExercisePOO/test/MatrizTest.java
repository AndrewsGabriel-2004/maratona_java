package maratonajava.ExercisePOO.test;

import maratonajava.ExercisePOO.domain.Matriz;
import maratonajava.ExercisePOO.domain.MatrizResult;

import java.util.Scanner;

public class MatrizTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Matriz matriz1 = new Matriz();
        Matriz matriz2 = new Matriz();

        System.out.println("Matriz 1:");
        matriz1.tamanhoMatriz();
        System.out.println("Matriz 2:");
        matriz2.tamanhoMatriz();

        MatrizResult matrizResult = new MatrizResult(matriz1);

        matrizResult.somaMatriz(matriz1,matriz2);

        matrizResult.print(matriz1,matriz2);
    }
}
