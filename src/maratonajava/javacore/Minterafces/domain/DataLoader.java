package maratonajava.javacore.Minterafces.domain;

public interface DataLoader {
    public  abstract void load();
    public static final int MAX_DATA_SIZE = 10;

    default void checkPermission(){
        System.out.println("Checking Permissions");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Inside of retriveMaxDataSize on Interface");
    }
}
