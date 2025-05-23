package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08Reduce {
    private static final List<LightNovel> novels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitarra", 8.99),
            new LightNovel("Full Metal", 2.99),
            new LightNovel("No Game No Life", 5.99),
            new LightNovel("Kumo Desuga", 1.99),
            new LightNovel("Kumo Desuga", 1.99),
            new LightNovel("Monogatari", 4.00),
            new LightNovel("Violet Evergarden", 3.99)
    ));
    public static void main(String[] args) {
        //add all prices above 3 and return just the result
        novels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3.0)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = novels.stream()
                .mapToDouble(LightNovel::getPrice) //return Stream<Double>
                .filter(price -> price > 3.0)
                .sum(); //return double
        System.out.println(sum);


    }
}
