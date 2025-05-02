package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Ycolecoes.dominio.Consumer;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        //Type Erasure
        List<String> list = new ArrayList<>(); //<> -> check in compilation time
        list.add("Midoriya");


        //list.add(123L);
        //list.add(new Consumer("Goku"));
        //for (Object o : list){
        //    if(o instanceof String){
        //        System.out.println(o);
        //    } if (o instanceof  Long){
        //        System.out.println(o);
        //    } if (o instanceof Consumer){
        //        Consumer c = (Consumer) o;
        //        System.out.println(c);
        //    }
        //}

        for (String o : list){
            System.out.println(o);
        }
        add(list, new Consumer("Midoriya"));

    }
    private static void add(List list, Consumer consumer){
        list.add(consumer);
    }
}
