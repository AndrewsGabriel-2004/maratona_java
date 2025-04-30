package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Consumer;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("Andrews Gabriel");
        Consumer consumer2 = new Consumer("William Suane");

        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("F", "Letra F");
        map.put("C", "Letra C");
        map.put("B", "Letra B");
        map.put("D", "Letra D");
        map.put("E", "Letra E");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        //the order comes from key
        //The class has to extend comparable

        System.out.println(map.headMap("C", true)); //behind C in the alfabetic
        System.out.println(map);
        System.out.println(map.ceilingKey("C"));
        System.out.println(map.higherKey("C"));
        System.out.println(map.lowerKey("C"));
        System.out.println(map.floorKey("C"));
    }
}
