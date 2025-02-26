package maratonajava.javacore.Dconstrutores.domain;

public class Anime {
    private String name;
    private String types;
    private int episodes;
    private String genre;
    private String studio;


    public Anime(String name, String types, int episodes, String genre,String studio){ //always in first
        this(name, types, episodes, genre);
        this.studio = studio;

    }

    public Anime(String name, String types, int episodes, String genre){
        this();
        System.out.println("Dentro do construtor");
        this.name = name;
        this.types = types;
        this.episodes = episodes;
        this.genre = genre;
    }

    public Anime(){
        System.out.println("nothing");
    }

//    public void init(String name, String types, int episodes) { //simulando o set
//        this.name = name;
//        this.types = types;
//        this.episodes = episodes;
//    }
//    Construtor:

//    public void init(String name, String types, int episodes, String genre) { //simulando o set
//        this.init(name, types, episodes);
//        this.genre = genre;
//    }

    public void print() {
        System.out.println(this.types);
        System.out.println(this.episodes);
        System.out.println(this.name);
        System.out.println(this.genre);
    }

    public void setName(String name) {

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

    public String getTypes() {
        return this.types;
    }

    public int getEpisodes() {

        return this.episodes;
    }

    public void setEpisodes(int episodes) {

        this.episodes = episodes;
    }
}