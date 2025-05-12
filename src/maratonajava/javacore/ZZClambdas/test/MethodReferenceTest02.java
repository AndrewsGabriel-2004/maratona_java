package maratonajava.javacore.ZZClambdas.test;

import maratonajava.javacore.ZZClambdas.domain.Anime;
import maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Berserk", 10654), new Anime("One Piece", 1200), new Anime("Naruto", 500)));
        animes.sort(animeComparators::compareByEpisodesNonStatic);//call by the object
        animes.sort((a1,a2) -> animeComparators.compareByEpisodesNonStatic(a1,a2));
        System.out.println(animes);
    }
}