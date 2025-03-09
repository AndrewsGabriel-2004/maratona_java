package maratonajava.javacore.Minterafces.domain;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading Data from Database");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from Database");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking Permissions on Database");
    }


}
