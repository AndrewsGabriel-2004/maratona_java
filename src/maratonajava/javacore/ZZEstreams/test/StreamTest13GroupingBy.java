package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.Category;
import maratonajava.javacore.ZZEstreams.domain.LightNovel;
import maratonajava.javacore.ZZEstreams.domain.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13GroupingBy {
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
        Map<Promotion, List<LightNovel>> collect = novels.stream()
                .collect(Collectors.groupingBy(StreamTest13GroupingBy::getPromotion));
        System.out.println(collect);

        //Map<Category, Map<Promotion, List<LightNovel>>>
        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = novels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.groupingBy(StreamTest13GroupingBy::getPromotion)));

        System.out.println(collect1);

    }
    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NO_PROMOTION;
    }
}
