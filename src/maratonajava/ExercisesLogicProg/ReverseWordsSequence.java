package maratonajava.ExercisesLogicProg;

import java.util.Scanner;

public class ReverseWordsSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a sentence: ");
        String phrase = sc.nextLine();
        System.out.print("Reverse sentence: ");

        char [] charArray = phrase.toCharArray();
        for(int i = phrase.length()-1; i >= 0; i--){
            System.out.print(charArray[i]);
        }


    }
}
