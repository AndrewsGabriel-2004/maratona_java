package maratonajava.javacore.Fmodificadoresstatics.domain;

public class Anime {
    private String name;
    private static int[] episodes; //todos os objetos terão 100 ep

   static {   //precisa ser executado apenas uma vez, por isso o uso de static
       System.out.println("Dentro do bloco");
       episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    static {   //precisa ser executado apenas uma vez, por isso o uso de static
        System.out.println("Dentro do bloco s1");

    }
    static {   //precisa ser executado apenas uma vez, por isso o uso de static
        System.out.println("Dentro do bloco s2");

    }
    static {   //precisa ser executado apenas uma vez, por isso o uso de static
        System.out.println("Dentro do bloco s3");

    }

    {
        System.out.println("Dentro do bloco ns");
    }


    public Anime() {
        for (int num : Anime.episodes) {  //getepisode come back here
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}

