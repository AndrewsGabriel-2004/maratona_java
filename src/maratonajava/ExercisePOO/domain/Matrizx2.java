package maratonajava.ExercisePOO.domain;

import java.util.Scanner;

public class Matrizx2 implements SizeMatriz {
    Scanner sc = new Scanner(System.in);
    int size;
    @Override
    public void sizeMatriz() {
        System.out.print("Tamanho da matriz? ");
        this.size = sc.nextInt();
    }
    public void somaMatriz(int[] matriz) {
        for (int i = 0; i < this.size; i++) {
            matriz[i] = matriz[i] * 2;
            System.out.println("Matriz["+i+"]: "+ matriz[i]);
        }
    }
    public void monteMatriz(int[] matriz){
        for(int i = 0; i < this.size; i++) {
            System.out.print("Digite o número da  Matriz["+i+"]: ");
            sc.nextLine();
            matriz[i] = sc.nextInt();
        }
    }
}