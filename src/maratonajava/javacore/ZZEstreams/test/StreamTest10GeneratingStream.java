package maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10GeneratingStream {
    public static void main(String[] args) {
        //generating infinite streams (iterate-accept unary operation-
        // and generate just accept the seed)
        Stream.iterate(1, n-> n + 2)
                .limit(10)
                .forEach(System.out::println);
        //0,1,1,2,3,5,8,13,21,34...
        // 0 1
        //(0,1) (1,1) (1,2) (2,3)...

        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(a -> System.out.println(Arrays.toString(a)));

        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(System.out::print);

        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        //() -> that's supplier
        Stream.generate(() -> threadLocalRandom.nextInt(1,500))
                .limit(90)
                .forEach(System.out::println);

    }
}
