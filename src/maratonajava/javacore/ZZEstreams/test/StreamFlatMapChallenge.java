package maratonajava.javacore.ZZEstreams.test;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFlatMapChallenge {
    public static void main(String[] args) {
        List<String> chapterCrimeECastigo1 = List.of("Razumikhin","Castigo","Amor","Culpa","Perdão");
        List<String> chapterCrimeECastigo2 = List.of("Petrovich","Anna","Raskolnikov");
        List<List<String>> crimeECastigo = new ArrayList<>();
        crimeECastigo.add(chapterCrimeECastigo1);
        crimeECastigo.add(chapterCrimeECastigo2);

        List<String> chapterOsSertoes = List.of("O sertão é antes de tudo forte","secura","Antônio Conselheiro","Euclides","Cunha", "Cunha");
        List<List<String>> osSertoes = new ArrayList<>();
        osSertoes.add(chapterOsSertoes);

        List<List<List<String>>> books = new ArrayList<>();
        books.add(crimeECastigo);
        books.add(osSertoes);
        //books/book/chapter/words
        List<String> collect = books.stream()
                .flatMap(Collection::stream)
                .flatMap(Collection::stream)
                .map(w -> w.split(" "))
                .flatMap(Arrays::stream)
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
