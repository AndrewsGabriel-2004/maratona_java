package maratonajava.javacore.Oexceptions.exceptions.test;

import maratonajava.javacore.Oexceptions.exceptions.domain.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginExceptionTest01 {
    public static void main(String[] args) {
        try {
            Login();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }
    }

    private static void Login() throws InvalidLoginException{
        String userNameDB = "Andrews";
        String passwordDB = "2004Fella";
        Scanner sc = new Scanner(System.in);
        System.out.println("User: ");
        String userName = sc.nextLine();
        System.out.println("Password: ");
        String password = sc.nextLine();
        if(!userNameDB.equals(userName) || !passwordDB.equals(password)){
            throw new InvalidLoginException("Invalid Login");
        }

        System.out.println("Login Successful");
    }
}
