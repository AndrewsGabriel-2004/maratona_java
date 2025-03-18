package maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name = "Andrews"; //String constant pool
        String name2 = "Andrews";
        //!=
        System.out.println(name == name2); //object
         name = name.concat(" Gabriel"); // name += " gabriel"
        System.out.println(name == name2);
        String name3 = new String("Andrews");
        System.out.println(name2 == name3); //objects different
        System.out.println(name2 == name3.intern()); //same objects

    }
}
