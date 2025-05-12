package maratonajava.javacore.ZZClambdas.test;

import maratonajava.javacore.ZZClambdas.domain.Anime;
import maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Berserk", 10654), new Anime("One Piece", 1200), new Anime("Naruto", 500)));
        animes.sort((a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
        animes.sort(AnimeComparators::compareByTitle);
        animes.sort(AnimeComparators::compareByEpisodes);

        System.out.println(animes);



    }
}
