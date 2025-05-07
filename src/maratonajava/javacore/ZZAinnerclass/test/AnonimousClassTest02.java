package maratonajava.javacore.ZZAinnerclass.test;

import maratonajava.javacore.Zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class BoatNameComparator implements Comparator<Boat>{
    @Override
    public int compare(Boat o1, Boat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class AnonimousClassTest02 {
    public static void main(String[] args) {
        List<Boat> boatList = new ArrayList<>(List.of(new Boat("Lancha"), new Boat("Canoe")));

        //boatList.sort(new Comparator<Boat>() { =======> Anonymous way
        //    @Override
        //    public int compare(Boat o1, Boat o2) {
        //        return o1.getName().compareTo(o2.getName());
        //    }
        //});

        Collections.sort(boatList, new BoatNameComparator().reversed()); // ==> The classic way

        //boatList.sort(Comparator.comparing(Boat::getName));  --> that's a simplify way to use comparator
        System.out.println(boatList);

    }
}
