package maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        List<String[]> stream = words.stream().map(w -> w.split("")).collect(Collectors.toList());
        List<String> stringStream = words.stream().map(w -> w.split("")) //Stream<String[]>
                .flatMap(Arrays::stream) //Stream<String>
                .collect(Collectors.toList());
        System.out.println(stringStream);
    }
}
