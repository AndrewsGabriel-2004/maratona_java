package maratonajava.ExercisesLogicProg;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if(idade >= 18){
            System.out.println(name+ " é maior de idade");
        }else {
            System.out.println(name+ " é menor de idade");
        }


    }
}
