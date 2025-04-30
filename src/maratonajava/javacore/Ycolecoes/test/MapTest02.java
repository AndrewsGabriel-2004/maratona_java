package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Consumer;
import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("Dev Dojo Academy");
        Consumer consumer2 = new Consumer("Andrews Gabriel");

        Manga manga1 = new Manga(5L, "Attack on Titan", 19.9);
        Manga manga2 = new Manga(1L, "Berserk", 9.5);
        Manga manga3 = new Manga(3L, "Pokemon", 11.20);
        Manga manga4 = new Manga(4L, "Dragon Ball Z", 2.99);
        Manga manga5 = new Manga(2L, "Hellsing Ultimate", 3.2);

        Map<Consumer, Manga> map = new HashMap<>();
        map.put(consumer1, manga1);
        map.put(consumer2, manga4);
        for (Map.Entry<Consumer, Manga> entry : map.entrySet()){
            System.out.println(entry.getKey().getName() + ": "+ entry.getValue().getName());
        }


    }
}
