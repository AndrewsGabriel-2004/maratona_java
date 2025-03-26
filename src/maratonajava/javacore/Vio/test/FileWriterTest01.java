package maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//File/FileWriter/FileReader/BufferedWriter/BufferedReader
public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            //fw.close(); //why that's use OS resources, Filewriter extends closeable
            fw.write("DevDojo is beautiful, it's the best Brazil's course \n Continuing \n");
            fw.flush(); //spit all inside buffer
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
