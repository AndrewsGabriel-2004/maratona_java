package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIDComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga01, Manga manga2) {
        return manga01.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Attack on Titan", 19.9));
        mangas.add(new Manga(1L, "Berserk", 9.5));
        mangas.add(new Manga(2L, "Hellsing Ultimate", 3.2));
        mangas.add(new Manga(3L, "Pokemon", 11.20));
        mangas.add(new Manga(4L, "Dragon Ball Z", 2.99));
        System.out.println(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas);//the class to have the implements Comparable
        System.out.println("========");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        //mangas.sort(new MangaByIDComparator());
        Collections.sort(mangas, new MangaByIDComparator());//the class to have the implements Comparable
        System.out.println("========");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
