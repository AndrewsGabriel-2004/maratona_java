package maratonajava.javacore.Oexceptions.exceptions.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException{
           criateNewFile();
    }

    public static void criateNewFile() throws IOException {
        File file = new File("archive\\teste.txt");
        try{
            boolean fileCreated = file.createNewFile();
            System.out.println("Archive created: "+ fileCreated);
        }catch (IOException ex){
            ex.printStackTrace();
             throw ex;//return this exception again, because we already have the exception
        }
    }

}
