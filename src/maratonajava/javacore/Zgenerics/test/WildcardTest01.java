package maratonajava.javacore.Zgenerics.test;

abstract class Animal {
    public abstract void consult();
}

class Cachorro extends Animal {

    @Override
    public void consult() {
        System.out.println("Consulting the Dog");
    }
}

class Gato extends Animal {

    @Override
    public void consult() {
        System.out.println("Consulting Cat");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        printConsult(cachorros);
        printConsult(gatos);
        Animal[] animals = {new Gato(), new Cachorro()};
        printConsult(animals);
    }

    private static void printConsult(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consult();
        }
        //animals[1] = new Gato();//array store exception
    }
}
