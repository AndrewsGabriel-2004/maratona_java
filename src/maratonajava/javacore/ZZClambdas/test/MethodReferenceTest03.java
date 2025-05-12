package maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru"));
        //String implements comparable
        strings.sort(String::compareTo); //compareTo are nonstatic
        System.out.println(strings);

        Function<String, Integer> numStringToInteger = Integer::parseInt;

        System.out.println(numStringToInteger.apply("10"));

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(strings, "Veldora"));


    }
}
