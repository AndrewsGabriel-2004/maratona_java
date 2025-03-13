package maratonajava.ExercisesLogicProg;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do Aluno: ");
        String name = sc.nextLine();

        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = sc.nextDouble();
        System.out.print("Nota 4: ");
        double n4 = sc.nextDouble();

        double media = (n1+n2+n3+n4)/4;

        if(media >= 7){
            System.out.println("Parábens, "+ name + "! Você foi aprovado!");
        }else {
            System.out.println("Reprovado.");
        }

    }
}
