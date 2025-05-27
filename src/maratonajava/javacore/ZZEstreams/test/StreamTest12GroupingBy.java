package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.Category;
import maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12GroupingBy {
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
        //Map<Category, List<LightNovel>> categoryList = new HashMap<>();
        //List<LightNovel> fantasy = new ArrayList<>();
        //List<LightNovel> drama = new ArrayList<>();
        //List<LightNovel> romance = new ArrayList<>();

        //for(LightNovel lightNovel : novels){
        //    switch (lightNovel.getCategory()){
        //        case DRAMA: drama.add(lightNovel); break;
        //        case FANTASY: fantasy.add(lightNovel); break;
        //        case ROMANCE: romance.add(lightNovel); break;
        //    }
        //}
        //categoryList.put(Category.DRAMA, drama);
        //categoryList.put(Category.ROMANCE, romance);
        //categoryList.put(Category.FANTASY, fantasy);
        //System.out.println(categoryList);
        Map<Category, List<LightNovel>> collect = novels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
