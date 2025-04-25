package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone sm1 = new Smartphone("1ABC1","Iphone");
        Smartphone sm2 = new Smartphone("22222","Pixel");
        Smartphone sm3 = new Smartphone("33333","Samsung");
        List<Smartphone> sm = new ArrayList<>(6);

        sm.add(sm1);
        sm.add(sm2);
        sm.add(0,sm3);

        for(Smartphone smartphone: sm){
            System.out.println(smartphone);
            System.out.println("---------");
        }
        Smartphone sm4Wanted = new Smartphone("22222","Pixel");
        System.out.println(sm.contains(sm4Wanted));//equals was executed
        //System.out.println(sm4Wanted.equals(sm2)); the same thing above, we're comparing the serialNumber

        int indexSm4 = sm.indexOf(sm4Wanted);//the system get the original object position
        System.out.println(sm.get(indexSm4));

    }
}
