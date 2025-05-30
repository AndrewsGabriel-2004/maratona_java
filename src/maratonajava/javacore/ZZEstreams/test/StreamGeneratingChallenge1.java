package maratonajava.javacore.ZZEstreams.test;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamGeneratingChallenge1 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,100).filter(n -> n%2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        long count = IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0).count();
        System.out.println(count);
        System.out.println();
        Map<Integer, Long> collect = IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0).boxed().collect(Collectors.groupingBy(n -> n % 10, Collectors.counting()));
        System.out.print(collect);
    }
}
