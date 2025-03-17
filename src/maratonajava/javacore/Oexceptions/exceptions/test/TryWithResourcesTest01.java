package maratonajava.javacore.Oexceptions.exceptions.test;

import maratonajava.javacore.Oexceptions.exceptions.domain.Reader02;
import maratonajava.javacore.Oexceptions.exceptions.domain.Reader1;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        readFile2();
    }

    public static void readFile2(){
        try(Reader1 reader1 = new Reader1(); Reader02 reader02 = new Reader02()){

        } catch(IOException e){

        }
    }

    public static void readFile(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("file.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if(reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
