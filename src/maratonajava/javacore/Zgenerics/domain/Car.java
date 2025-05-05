package maratonajava.javacore.Zgenerics.domain;

public class Car {
    private String name;

    public Car(String nome) {
        this.name = nome;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nome='" + name + '\'' +
                '}';
    }
}
