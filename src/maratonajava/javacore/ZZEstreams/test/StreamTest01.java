package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class StreamTest01 {
    private static final List<LightNovel> novels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitarra", 8.99),
            new LightNovel("Full Metal", 2.99),
            new LightNovel("No Game No Life", 5.99),
            new LightNovel("Kumo Desuga", 1.99),
            new LightNovel("Monogatari", 4.00),
            new LightNovel("Violet Evergarden", 3.99)
    ));

    public static void main(String[] args) {
        novels.sort(Comparator.comparing(LightNovel::getTitle)); //how I will do now

        List<String> result = new ArrayList<>();
        int count = 0;
        for (LightNovel novel : novels) {
            if (novel.getPrice() <= 4 && count <=2){
                result.add(novel.getTitle());
                count++;
            }
        }
        System.out.println(novels);
        System.out.println(result);
    }
}
