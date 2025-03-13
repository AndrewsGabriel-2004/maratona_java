package maratonajava.ExercisesLogicProg;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int A = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        int B = sc.nextInt();

        int quociente =(int) A/B;
        int resto = A % B;

        System.out.println("Resto: "+ resto);
        System.out.println("Quociente: "+ quociente);

    }
}
