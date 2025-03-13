package maratonajava.ExercisesLogicProg;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hFrancisco = 1.5;
        double hMaria = 1.1;

        int anosParaIgualdade = (int) ((hFrancisco - hMaria)/(0.03 - 0.02));

        System.out.println("Anos para igualdade: "+ anosParaIgualdade);

    }
}
