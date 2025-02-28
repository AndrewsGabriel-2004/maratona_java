package maratonajava.ExercisePOO.test;

import maratonajava.ExercisePOO.domain.Alfabeto;

import java.util.Scanner;

public class AlfabetoTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] alfa = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        System.out.print("Até qual letra?");
        int number = sc.nextInt();

        Alfabeto alfabeto = new Alfabeto(alfa, number);

        alfabeto.sistChoose(number);

    }
}