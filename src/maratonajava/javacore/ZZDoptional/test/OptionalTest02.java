package maratonajava.javacore.ZZDoptional.test;

import maratonajava.javacore.ZZDoptional.domain.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

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
        //1ºCreate a repository
        //2ºSearch a Manga by title, if exists update the title
        //3ºSearch the id, if not exists throw argumentException
        //4ºSearch for title, if not exist create a new manga

        //2ºSearching process
        Manga newManga = new Manga(nameManga, ThreadLocalRandom.current().nextLong(10000));
        Optional<Manga> title = findTitle(newManga);
        Manga verification = title.orElse(newManga);
        if (!title.isPresent()){mangas.add(newManga);}
        System.out.println(mangas);
        System.out.println(verification);

        System.out.println("================");

        //3ºSearching the id
        Optional<Manga> title2 = findId(new Manga(id));
        title2.ifPresent(System.out::println);
        try {
            title2.orElseThrow((Supplier<Throwable>) () -> new IllegalArgumentException("Don't exist this Id"));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

    }

    private static Optional<Manga> findTitle(Manga obj) {
        //1- Creating a repository with Mangas:
        for (Manga manga : mangas) {
            if (manga.getTitle().equalsIgnoreCase(obj.getTitle())) {
                manga.setTitle(obj.getTitle() + "  Updated");
                return Optional.of(manga);
            }
        }
        return Optional.empty();
    }

    private static Optional<Manga> findId(Manga obj){
        //3- Searching process
        for (Manga manga : mangas) {
            if (manga.getId().equals(obj.getId())){
                return Optional.of(manga);
            }
        }
        return Optional.empty();
    }
}
