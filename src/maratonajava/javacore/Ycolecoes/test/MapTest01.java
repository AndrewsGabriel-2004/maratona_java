package maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        //map works with key and value
        //can't exist duplicate keys
        Map<String, String> map = new HashMap<>();//the order don't exist change with hash code
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc","você2");
        System.out.println(map);
        for(String key: map.keySet()){
            System.out.println(key + ": " +map.get(key));
        }

        System.out.println("=================");

        for(String value: map.values()){
            System.out.println(value);
        }

        System.out.println("=================");

        for(Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        //entry is an object that have key and value
        //String line = sc.nextLine;
        //String[] array = line.split(": ");
        //if(array.length >= 2){continue;}
        //String key = array[0];
        //String value = array[1];

    }
}
