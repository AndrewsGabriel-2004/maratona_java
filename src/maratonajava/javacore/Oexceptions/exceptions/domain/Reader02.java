package maratonajava.javacore.Oexceptions.exceptions.domain;

import java.io.Closeable;
import java.io.IOException;

public class Reader02 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Reader2 closed");
    }
}
