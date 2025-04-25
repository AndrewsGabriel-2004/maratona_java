package maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on Titan");
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Dragon Ball Z");

        Collections.sort(mangas); //I just can use it with a class that implements Comparable

        for(String manga: mangas){
            System.out.println(manga);
        }
        List<Double> moneys = new ArrayList<>();
        moneys.add(100.21);
        moneys.add(23.98);
        moneys.add(21.21);
        moneys.add(98.10);

        Collections.sort(moneys);

        System.out.println(moneys);


    }
}
