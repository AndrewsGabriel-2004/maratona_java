package maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(0);
        numbers.add(2);
        numbers.add(5);
        // (-(insertion point = where this element supposed to be in the list) -1)
        // index 0,1,2,3
        // value 0,2,2,5
        Collections.sort(numbers);
        System.out.println(Collections.binarySearch(numbers,7));




    }
}
