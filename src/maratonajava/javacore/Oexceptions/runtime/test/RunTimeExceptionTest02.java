package maratonajava.javacore.Oexceptions.runtime.test;

import java.io.IOException;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        division(1, 0);

        System.out.println("Finalized Code");
    }

    /**
     *
     * @param a
     * @param b can't be 0
     * @return
     * @throws IllegalArgumentException if b == 0
     */

    public static int division(int a, int b) {
        if(b == 0){
            throw new IllegalArgumentException("By zero");
        }
        return a/b;
    }
}
