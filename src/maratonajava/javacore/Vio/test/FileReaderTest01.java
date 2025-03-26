package maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileReader fr = new FileReader(file)) {
            //System.out.println(fr.read()); to identify the first word on File according with ascii table
            char[] in = new char[1000];
            int size = fr.read(in);
            System.out.println(size);
            for (char c : in) {
                System.out.print(c);
            }

//            int i;
//            while ((i = fr.read()) != -1){
//                System.out.print((char)i);
//            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
