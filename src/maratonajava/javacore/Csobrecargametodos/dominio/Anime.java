package maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String name;
    private String types;
    private int episodes;
    private String genre;



    public void init(String name, String types, int episodes) { //simulando o set
        this.name = name;
        this.types = types;
        this.episodes = episodes;
    }

    public void init(String name, String types, int episodes, String genre){ //simulando o set
        this.init(name, types, episodes);
        this.genre = genre;
    }

    public void print(){
        System.out.println(this.types);
        System.out.println(this.episodes);
        System.out.println(this.name);
        System.out.println(this.genre);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setTypes(String types) {
        this.types = types;
    }
    public String getTypes(){
        return this.types;
    }

    public int getEpisodes() {
        return this.episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}