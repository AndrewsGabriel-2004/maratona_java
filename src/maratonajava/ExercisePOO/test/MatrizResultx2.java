package maratonajava.ExercisePOO.test;

import maratonajava.ExercisePOO.domain.Matrizx2;

public class MatrizResultx2 {
    public static void main(String[] args) {
        int[] matriz = new int[100];
        Matrizx2 matrizx2 = new Matrizx2();
        matrizx2.sizeMatriz();
        matrizx2.monteMatriz(matriz);
        matrizx2.somaMatriz(matriz);

    }
}
