package maratonajava.javacore.ZZDoptional.test;

import maratonajava.javacore.ZZDoptional.domain.Manga;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;

public class OptionalTest02 {
    private static final List<Manga> mangas = new ArrayList<>(List.of(new Manga("Dragon Ball Z", 147L),
            new Manga("Naruto", 9L),
            new Manga("One Piece", 1200L),
            new Manga("Invencible", 23L),
            new Manga("Ghost Of Tsushima", 57L),
            new Manga("Boku no Hero", 198L),
            new Manga("HunterXHunter", 1457L)));

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome:");
        String nameManga = sc.nextLine();
        System.out.print("Id:");
        Long id = sc.nextLong();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy 'T' HH:mm:ss");
        //1ºCreate a repository
        //2ºSearch a Manga by title, if exists update the title
        //3ºSearch the id, if not exists throw argumentException
        //4ºSearch for title, if not exist create a new manga

        /////////////////////////////////////////

        Optional<Manga> bySomething1 = findBySomething(m -> m.getTitle().equalsIgnoreCase(nameManga));
        System.out.println(bySomething1.orElse(new Manga(nameManga, ThreadLocalRandom.current().nextLong(10000))));
        if (bySomething1.isPresent()){
            Manga manga = bySomething1.get();
            manga.setTitle(manga.getTitle() + " Updated " + LocalDateTime.now().format(dateTimeFormatter));
            System.out.println(mangas);
        }

        Optional<Manga> bySomething2 = findBySomething(m -> m.getId().equals(id));
        bySomething2.ifPresent(System.out::println);
        try {
            bySomething2.orElseThrow(IllegalArgumentException::new);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    //Third option:functional program
    private static Optional<Manga> findBySomething(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}
