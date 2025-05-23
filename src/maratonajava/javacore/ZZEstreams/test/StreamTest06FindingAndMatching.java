package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06FindingAndMatching {
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
        System.out.println(novels.stream().anyMatch(ln -> ln.getPrice() > 9));
        System.out.println(novels.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(novels.stream().noneMatch((ln -> ln.getPrice() < 0)));
        novels.stream().filter(ln -> ln.getPrice() > 3)
                .findAny()// any result, when im don't import with result
                .ifPresent(System.out::println);
        novels.stream().filter(lightNovel -> lightNovel.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);

    }
}
