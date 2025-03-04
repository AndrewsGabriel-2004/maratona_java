package maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class ReadingKeyboardTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Local: ");
        String local = sc.nextLine();
        System.out.println(local);

        System.out.println("Write your sex: ");
        char gender = sc.next().charAt(0);
        System.out.println(gender);

        //Already know about this fundamental
    }
}
