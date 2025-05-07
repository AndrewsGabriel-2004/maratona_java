package maratonajava.javacore.ZZAinnerclass.test;

public class OuterClassTest03 {
    private static String name = "Andrews Gabriel";
    private String name2 = "Pontes";

    static class Nested {
        //(static inner class)it's like other high level class
        void print(){
            System.out.println(name); //just accept static attributes
            System.out.println(new OuterClassTest03().name2); //other way
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();

    }
}
