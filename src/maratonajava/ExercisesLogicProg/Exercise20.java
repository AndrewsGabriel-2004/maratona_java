package maratonajava.ExercisesLogicProg;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número qualquer e digitarei sua tabuada de 10: ");
        int num = sc.nextInt();

        for(int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
            System.out.println("-----------");
        }
    }
}
