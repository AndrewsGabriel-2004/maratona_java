package maratonajava.javacore.Qstring.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatString(30_000);
        long end = System.currentTimeMillis();
        System.out.println("Time to String: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        concatStringBuilder(100_000);
        end = System.currentTimeMillis();
        System.out.println("Time to StringBuilder: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        concatStringBuffer(100_000);
        end = System.currentTimeMillis();
        System.out.println("Time to StringBuffer: " + (end - start) + "ms");

    }

    private static void concatString(int lenght) {
        String text = " ";
        for (int i = 0; i < lenght; i++) {
            text += i;
        }
    }

    private static void concatStringBuilder(int lenght) {
        StringBuilder sb = new StringBuilder(lenght);
        for (int i = 0; i < lenght; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int lenght) {
        StringBuffer sb = new StringBuffer(lenght);
        for (int i = 0; i < lenght; i++) {
            sb.append(i);
        }
    }
}