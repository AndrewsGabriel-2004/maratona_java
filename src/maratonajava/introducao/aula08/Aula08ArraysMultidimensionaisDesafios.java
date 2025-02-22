package maratonajava.introducao.aula08;
import java.util.Scanner;


public class Aula08ArraysMultidimensionaisDesafios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1 exercício: Crie um programa que preencha uma matriz variável
        // com números inteiros digitados pelo usuário e,
        // em seguida, exiba a soma de cada linha e de cada coluna.

        int[][] arrayVariable = new int[3][];

        arrayVariable[0] = new int[2];
        arrayVariable[1] = new int[6];
        arrayVariable[2] = new int[5];

        int maxColumns = 0;
        for (int i = 0; i < arrayVariable.length; i++) {
            if (maxColumns < arrayVariable[i].length){
                maxColumns = arrayVariable[i].length;
            }
        }

        int[] somaC = new int[maxColumns];
        int[] somaL = new int[3];
        for (int i = 0; i < arrayVariable.length; i++) { //line
            for (int j = 0; j < arrayVariable[i].length; j++) { //column

                System.out.print("Write the Matriz[" + i + "," + j + "] numbers: ");
                arrayVariable[i][j] = sc.nextInt();
                somaL[i] += arrayVariable[i][j];
                somaC[j] += arrayVariable[i][j];
            }
        }

        System.out.println("Matriz: ");

        for (int i = 0; i < arrayVariable.length; i++) { //line
            for (int j = 0; j < arrayVariable[i].length; j++) { //column

                System.out.print(arrayVariable[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("Addition per Line: ");

        for (int i = 0; i < arrayVariable.length; i++) { //line
            System.out.print("Line " + i + ": ");

            System.out.print(somaL[i]);

            System.out.println();
        }

        System.out.println("Addition per Colummn: ");

        for (int j = 0; j < maxColumns; j++){ //column

            if (somaC[j] == 0) {
                break;
            }

            System.out.print("Column " + j + ": ");

            System.out.print(somaC[j]);

            System.out.println();
        }

    }
}