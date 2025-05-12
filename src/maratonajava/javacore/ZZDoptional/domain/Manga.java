package maratonajava.javacore.ZZDoptional.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private String title;
    private Long id;

    public Manga(String title, Long id) {
        this.title = title;
        this.id = id;
    }

    public Manga(String title) {
        this.title = title;
    }

    public Manga(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "title='" + title + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(title, manga.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,id);
    }

    @Override
    public int compareTo(Manga otherManga) {
        return this.title.compareTo(otherManga.getTitle());
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
