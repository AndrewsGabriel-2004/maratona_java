package maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,50)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));//Stream<Integer>
        System.out.println();
        IntStream.range(1,50)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        Stream.of("Elevation", "the", "love", "in your heart")
                .forEach(s -> System.out.print(s + " "));

        int num[] = {1,2,3,4,5,6,7};
        //IntStream stream = Arrays.stream(num);
        System.out.println();
        Arrays.stream(num).average().ifPresent(System.out::println); //soutc

        try(Stream<String> lines = Files.lines(Paths.get("file.txt"))){
            //lines.forEach(System.out::println);
            lines.filter(l -> l.contains("Java")).forEach(n -> System.out.println(n));
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
