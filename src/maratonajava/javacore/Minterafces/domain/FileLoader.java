package maratonajava.javacore.Minterafces.domain;

public class FileLoader implements DataLoader , DataRemover{
    @Override
    public void load() {
        System.out.println("Loading Database from File");
    }

    @Override
    public void remove() {
        System.out.println("Deleting data from File");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking Permissions on File");
    }
}
