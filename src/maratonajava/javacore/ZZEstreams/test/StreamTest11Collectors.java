package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11Collectors {
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
        //summarization
        System.out.println(novels.stream()
                .count());
        System.out.println(novels.stream()
                .collect(Collectors.counting()));


        novels.stream()
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
        novels.stream()
                .collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)))
                .ifPresent(System.out::println);


        System.out.println(novels.stream()
                .mapToDouble(LightNovel::getPrice)
                .sum());
        System.out.println(novels.stream()
                .collect(Collectors.summingDouble(LightNovel::getPrice)));


        novels.stream()
                .mapToDouble(LightNovel::getPrice)
                .average()
                .ifPresent(System.out::println);
        System.out.println(novels.stream()
                .collect(Collectors.averagingDouble(LightNovel::getPrice)));


        //the real use is that:
        //1-summarize
        DoubleSummaryStatistics collect = novels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        String collect1 = novels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(collect1);
    }
}