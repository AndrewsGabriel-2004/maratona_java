package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodTest01 {
    public static void main(String[] args) {
        createArrayWithObject(new Boat("Canoa Marota"));
    }

    private static <T> void createArrayWithObject(T t){
        List<T> list = List.of(t);
        System.out.println(list);
    }

    private static <T> List<T> createArrayWithObject2(T t){
        List<T> list = List.of(t);
        return list;
    }

    private static <T extends Comparable> void createArrayWithObject3(T t){
        List<T> list = List.of(t);
        System.out.println(list);
    }
}

