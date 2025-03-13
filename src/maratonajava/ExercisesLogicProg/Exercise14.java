package maratonajava.ExercisesLogicProg;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        int A = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = sc.nextInt();

        int intermediario = A;
        A = B;
        B = intermediario;

        System.out.println("A: "+ A);
        System.out.println("B: "+ B);

    }
}
