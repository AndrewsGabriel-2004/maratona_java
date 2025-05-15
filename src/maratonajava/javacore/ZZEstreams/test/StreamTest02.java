package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
    private static final List<LightNovel> novels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitarra", 8.99),
            new LightNovel("Full Metal", 2.99),
            new LightNovel("No Game No Life", 5.99),
            new LightNovel("Kumo Desuga", 1.99),
            new LightNovel("Monogatari", 4.00),
            new LightNovel("Violet Evergarden", 3.99)
    ));

    public static void main(String[] args) {
        List<String> streams = novels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(novel -> novel.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle) //return stream too now the objective is a final operation
                .collect(Collectors.toList());
        System.out.println(streams);
    }
}
