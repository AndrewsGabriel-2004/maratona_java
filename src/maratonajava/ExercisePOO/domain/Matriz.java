package maratonajava.ExercisePOO.domain;

import java.util.Scanner;

public class Matriz {
    private int [][] arrayMatriz;
    public static Scanner sc = new Scanner(System.in);
    private static int x;
    private static int y;

        //bloco de inicialização
   static{
        System.out.println("Defina o Tamanho da Matriz abaixo");
        System.out.print("Tamanho da linha: ");
        x = sc.nextInt();

        System.out.print("Tamanho da coluna: ");
        sc.nextLine();
        y = sc.nextInt();

    }


    //métodos
    public void tamanhoMatriz() {
        arrayMatriz = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Qual o número da posição [" + i + "," + j + "]? ");
                arrayMatriz[i][j] = sc.nextInt();
            }
        }

    }

    //getter
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[][] getArrayMatriz() {
        return arrayMatriz;
    }
}
