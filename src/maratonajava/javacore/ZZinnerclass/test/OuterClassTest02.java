package maratonajava.javacore.ZZinnerclass.test;

public class OuterClassTest02 {
    private String name = "Midoriya";

    //Local classes != Nested Classes
    //Local classes: a class in a method or initializer
    void print() {
        final String lastName = "Izuku";
        //attribute has to be effectively final (by the difference time between Class and Method)
         class LocalClass {
            public void printLocal(){
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassTest02 outer = new OuterClassTest02();
        //Local class is different, I need to initialize directly on method
        outer.print();

    }
}
