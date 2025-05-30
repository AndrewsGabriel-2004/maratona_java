package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.Category;
import maratonajava.javacore.ZZEstreams.domain.LightNovel;
import maratonajava.javacore.ZZEstreams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest15GroupingBy {
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
        Map<Category, DoubleSummaryStatistics> collect = novels.stream().collect(Collectors
                .groupingBy(LightNovel::getCategory,
                        Collectors.summarizingDouble(LightNovel::getPrice)));

        System.out.println(collect);

        Map<Category, List<Promotion>> collect1 = novels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.mapping(StreamTest15GroupingBy::getPromotion,
                                Collectors.toList())));

        System.out.println(collect1);

        Map<Category, Set<Promotion>> collect2 = novels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.mapping(StreamTest15GroupingBy::getPromotion,
                                Collectors.toSet())));

        System.out.println(collect2);

        Map<Category, LinkedHashSet<Promotion>> collect3 = novels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.mapping(StreamTest15GroupingBy::getPromotion,
                                Collectors.toCollection(LinkedHashSet::new))));

        System.out.println(collect3);
    }
    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NO_PROMOTION;
    }
}
