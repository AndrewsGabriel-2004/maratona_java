package maratonajava.javacore.Oexceptions.exceptions.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criateNewFile();
    }

    private static void criateNewFile(){
        File file = new File("archive\\teste.txt");
        try{ //tenta fazer alguma coisa
            boolean fileCreated = file.createNewFile();
            System.out.println("Archive created: "+ fileCreated);//need treatment, for security java force you to do a treatment
        }catch (IOException ex){ //if there's problems, catch, "ex" is the ref of object//how much specific is the Exception better, why that could be more understandable, don't put business logic on catch, catch's space it's only for exceptions
            ex.printStackTrace(); //print everything that's happen with the stack
        }
    }
}
