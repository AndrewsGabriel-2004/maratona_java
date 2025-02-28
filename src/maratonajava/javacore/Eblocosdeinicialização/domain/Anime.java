package maratonajava.javacore.Eblocosdeinicialização.domain;

public class Anime {
    private String name;
    private int[] episodes;

    {
        episodes = new int[100];
        for(int i=0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }


    public Anime() {
        for (int num:episodes){  //getepisode come back here
            System.out.print(num +" ");
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
