package ZZClambdas.test;

import ZZClambdas.domain.Anime;
import ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        //to classes without constructors (no parameters)
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Berserk", 10654), new Anime("One Piece", 1200), new Anime("Naruto", 500)));
        animes.sort(animeComparators::compareByEpisodesNonStatic);

        System.out.println(animes);

        BiFunction<String, Integer, Anime> animeBiFunction = (title,integer) -> new Anime(title,integer);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction2.apply("Super Campeones",36 ));

    }
}
