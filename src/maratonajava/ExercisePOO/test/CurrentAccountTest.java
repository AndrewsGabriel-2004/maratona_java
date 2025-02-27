package maratonajava.ExercisePOO.test;

import maratonajava.ExercisePOO.domain.CurrentAccount;

import java.util.Scanner;

public class CurrentAccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CurrentAccount currentAccount = new CurrentAccount();

        System.out.println("Digit your number Account: ");
        currentAccount.numberAccount = sc.nextInt();

        System.out.println("Digit your balance: ");
        currentAccount.balance = sc.nextDouble();
        sc.nextLine();

        System.out.println("Your Account is Special?(yes/no) ");
        String answer1 = sc.nextLine().trim();
        if(answer1.equalsIgnoreCase("yes") || answer1.equalsIgnoreCase("y")){
            currentAccount.special();
        }else{
            currentAccount.nonSpecial();
        }


        System.out.println("Do you want to see your status(yes/no)? ");
        String answer2 = sc.nextLine().trim();
        if(answer2.equalsIgnoreCase("yes") || answer2.equalsIgnoreCase("y")){
            currentAccount.status();
        }else {
            System.out.println("ok");
        }

        System.out.println("Do you have a Special Check? ");
        String answer3 = sc.nextLine().trim();
        if(answer3.equalsIgnoreCase("yes") || answer3.equalsIgnoreCase("y")){
            currentAccount.specialCheck();
        }else{
            currentAccount.nonSpecialCheck();
        }

        currentAccount.deposit(3000);
        currentAccount.deposit(3500);
        currentAccount.deposit(4000);

        currentAccount.draw(5000);
        currentAccount.draw(5000);
        currentAccount.draw(5000);

        currentAccount.check();

        currentAccount.consultBalance();

        sc.close();
    }
}
