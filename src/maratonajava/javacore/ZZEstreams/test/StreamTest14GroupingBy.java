package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.Category;
import maratonajava.javacore.ZZEstreams.domain.LightNovel;
import maratonajava.javacore.ZZEstreams.domain.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest14GroupingBy {
    private static final List<LightNovel> novels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitarra", 8.99, Category.FANTASY),
            new LightNovel("Full Metal", 2.99, Category.FANTASY),
            new LightNovel("No Game No Life", 5.99, Category.DRAMA),
            new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE),
            new LightNovel("Violet Evergarden", 3.99, Category.DRAMA)
    ));

    public static void main(String[] args) {
        Map<Category, Long> collect = novels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));

        System.out.println(collect);

        //return optional
        Map<Category, Optional<LightNovel>> collect1 = novels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        //take off optional
        Map<Category, LightNovel> collect2 = novels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect2);

        //take off optional with style
        Map<Category, LightNovel> collect3 = novels.stream()
                .collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect3);
    }
}
