package maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("DevDojo is beautiful, it's the best Brazil's course \n Continuing \n");
            bw.newLine();
            bw.flush(); //spit all inside buffer
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
