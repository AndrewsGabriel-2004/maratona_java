package maratonajava.javacore.Oexceptions.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        openConnection();
    }

    public static void openConnection() {
        try {
            System.out.println("Openning Archive");
            System.out.println("Writting data from Archive");
            throw new RuntimeException("Error in connection");
        } finally {
            System.out.println("Connection closed");
        }

    }
}
