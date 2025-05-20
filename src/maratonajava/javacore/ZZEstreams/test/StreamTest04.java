package maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> graphicsDesigners = List.of("William Suane","Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("William","David", "Harrison");
        List<String> students = List.of("Édipo", "Gustavo Lima", "Gustavo Mendes", "Guilherme");
        devDojo.add(graphicsDesigners);
        devDojo.add(students);
        devDojo.add(developers);
        for (List<String> people : devDojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        System.out.println("-----------------");
        //that's a stream of strings
        devDojo.stream().flatMap(Collection::stream).forEach(System.out::println);
        //map different of flatmap



    }
}
