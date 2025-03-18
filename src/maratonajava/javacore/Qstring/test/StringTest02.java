package maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "   Luffy   ";
        String numbers = "012345";
        System.out.println(name.charAt(4));
        System.out.println(name.length());
        System.out.println(name.replace("f", "l"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(numbers.length());
        System.out.println(numbers.substring(0,numbers.length())); //exclusive, (value-1)
        System.out.println(name.trim()); //remove void space


    }
}
