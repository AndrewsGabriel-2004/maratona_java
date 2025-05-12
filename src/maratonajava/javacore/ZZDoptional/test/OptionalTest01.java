package maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        //used to avoid the nullException, where the return can be optional
        Optional<String> optional = Optional.of("Aha uhu o Dev Dojo é foda.");

        System.out.println(optional);

        Optional<String> name = Optional.ofNullable(findName("Andrews"));
        String empty = name.orElse("Optional is EMPTY");
        System.out.println(empty);
        name.ifPresent(s -> System.out.println(s.toUpperCase()));

        //System.out.println(name.toUpperCase()); //here's where the exception supposed to appear
    }

    private static String findName(String name){
        List<String> strings = List.of("Andrews", "Pontes", "Gabriel");
        int i = strings.indexOf(name);
        if(i >= 0){
        return strings.get(i);
        }
        return null;
    }
}
