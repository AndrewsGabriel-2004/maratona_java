package maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("folder");
        boolean isDirectoryCreated = fileDirectory.mkdir();
        System.out.println(isDirectoryCreated);

        File fileFolderDirectory = new File(fileDirectory,"archive.txt");
        boolean isFileCreated = fileFolderDirectory.createNewFile();
        System.out.println(isFileCreated);

        File fileRenamed = new File(fileDirectory,"archive_renamed.txt");
        boolean isRenamed = fileFolderDirectory.renameTo(fileRenamed);
        System.out.println(isRenamed);

        File directoryRenamed = new File("folder_renamed");
        boolean b = fileDirectory.renameTo(directoryRenamed);
        System.out.println(b);
    }
}
