package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        //Consumer consumer = new Consumer("William Suane");
        //Queue<Consumer> consumerQueue = new PriorityQueue<>();
        //consumerQueue.add(consumer); //consumer isn't comparable
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPriceComparator().reversed());

        mangas.add(new Manga(5L, "Attack on Titan", 19.9, 8));
        mangas.add(new Manga(4L, "Dragon Ball Z", 2.99, 9));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(2L, "Hellsing Ultimate", 3.2, 7));
        mangas.add(new Manga(3L, "Pokemon", 11.20, 2));
        mangas.add(new Manga(10L, "Aaragon", 2.99, 4));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }

    }
}
