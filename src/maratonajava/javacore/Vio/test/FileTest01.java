package maratonajava.javacore.Vio.test;

import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;


public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created: " + isCreated);
            System.out.println("path: "+ file.getPath());
            System.out.println("path: "+file.getAbsolutePath());
            System.out.println("is directory: "+file.isDirectory());
            System.out.println("is file: "+file.isFile());
            System.out.println("is hidden: "+file.isHidden());

            System.out.println("last modified: "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
            boolean exists = file.exists();
            if(exists){
                System.out.println("Deleted: " + file.delete());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
