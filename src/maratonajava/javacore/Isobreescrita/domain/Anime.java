package maratonajava.javacore.Isobreescrita.domain;

public class Anime{
    private String name;

    //construtor
    public Anime(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Anime{" + "name='" + name + '\'' + '}';
    }

    //setter e getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
