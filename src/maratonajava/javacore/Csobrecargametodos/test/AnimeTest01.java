package maratonajava.javacore.Csobrecargametodos.test;

import maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();      // <- representa o construtor
        anime.init("Kakashi", "TV",12,"Action");
        anime.print();

    }
}
