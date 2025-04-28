package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        //String nome = "Andrews Gabriel";
        //String nome2 = "Andrews Gabriel";
        //String nome3 = new String("Andrews Gabriel");
        //System.out.println(nome == nome2);In String Pool
        //System.out.println(nome == nome3);Use refs to compare, nome3 is on Heap/nome is on pool
        //System.out.println(nome == nome3.intern());
        //System.out.println(nome.equals(nome3));Compare values

        Smartphone s1 = new Smartphone("1ABC1","Iphone");
        Smartphone s2 = new Smartphone("1ABC1","Iphone");
        System.out.println(s1.equals(s2)); //If the refs are indicating the same object

    }
}
