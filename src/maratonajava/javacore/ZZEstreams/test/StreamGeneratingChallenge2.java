package maratonajava.javacore.ZZEstreams.test;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamGeneratingChallenge2 {
    public static void main(String[] args) {
        Map<Integer, List<String>> collect = Stream.generate(() -> generatingRandomsStrings()).limit(20).collect(Collectors.groupingBy(String::length));
        System.out.println(collect);

    }
    public static String generatingRandomsStrings(){
        int lenght = ThreadLocalRandom.current().nextInt(3,8);
        return IntStream.range(0, lenght)
                .mapToObj(i -> (char) ('a' + ThreadLocalRandom.current().nextInt(26)))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();

        //Isso é só a expressão lambda:
        //“Para cada número i do stream, execute o que vem depois da ->”.
        //
        //OBS: O i nem é usado no corpo, serve só pra cumprir o contrato da lambda.
        //'a' + 0  = 'a'
        //'a' + 1  = 'b'
        //'a' + 25 = 'z'

        }
}
