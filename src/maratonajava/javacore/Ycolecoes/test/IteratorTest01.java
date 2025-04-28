package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Attack on Titan", 19.9,0));
        mangas.add(new Manga(1L, "Berserk", 9.5,5));
        mangas.add(new Manga(2L, "Hellsing Ultimate", 3.2,0));
        mangas.add(new Manga(3L, "Pokemon", 11.20,2));
        mangas.add(new Manga(4L, "Dragon Ball Z", 2.99,0));

        //Iterator<Manga> mangaIterator = mangas.iterator();
        //while (mangaIterator.hasNext()){
        //    if(mangaIterator.next().getQuantity() == 0){
        //        mangaIterator.remove();
        //    }
        //}
        //System.out.println(mangas);

        mangas.removeIf(xa -> xa.getQuantity() == 0);
        System.out.println(mangas);
    }
}
