package maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        //List nomes = new ArrayList(); 1.4
        //nomes.add("william");
        //nomes.add("DevDojo");
        //for(Object nome: nomes){
        //sout(nome)}

        List<String> nomes = new ArrayList<>(300); //good practical to avoid the array resize
        List<String> nomes2 = new ArrayList<>(300);
        nomes.add("William");
        nomes.add("DevDojo");
        nomes2.add("Suane");
        nomes2.add("Academy");

        //nomes.remove("William");
        //nomes.remove(0);
        nomes.addAll(nomes2);
        for (String nome : nomes) {
            System.out.println(nome);
        }
        int size = nomes.size();
        System.out.println("-------------");
        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(i));
        }
        System.out.println(nomes);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1); //auto-boxing (primitive type to wrapper)


    }
}
