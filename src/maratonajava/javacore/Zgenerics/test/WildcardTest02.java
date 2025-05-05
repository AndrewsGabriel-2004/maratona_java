package maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsult(cachorros);
        printConsult(gatos);
        List<Animal> animals = new ArrayList<>();
        printConsultAnimal(animals);
    }

    //Type Erasure
    private static void printConsult(List<? extends Animal> animals) {
        //here is Animal and sons (below)
        Animal a = new Cachorro();
        Animal a2 = new Gato();

        for (Animal animal : animals) {
            animal.consult();
        }
        //I can't .add, because I don't have certain of what will be the List Type

    }
    private static void printConsultAnimal(List<? super Animal> animals){
        //here is Animal and fathers(above)
        //Cachorro, Animal and Objects

        //for (Object o : animals){
        //    if(o instanceof Cachorro){
        //    }
        //}

        animals.add(new Cachorro());
        animals.add(new Gato());

    }
}
