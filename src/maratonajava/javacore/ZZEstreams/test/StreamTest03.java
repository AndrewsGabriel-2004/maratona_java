package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
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
        Stream<LightNovel> stream = novels.stream();
        novels.forEach(System.out::println);
        //foreach is a final operation on streams
        //from collections for each isn't a terminal operation it's just a method

        System.out.println(novels);
        long count = stream.filter(ln -> ln.getPrice() <= 4).count();
        System.out.println(count);

        //equals and hash on distinct use attention
        //distinct implements equals and hash code deleting duplicate elements
        long count1 = novels.stream().distinct().filter(ln -> ln.getPrice() <= 4).count();
        System.out.println(count1);

    }
}
