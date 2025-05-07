package maratonajava.javacore.ZZinnerclass.test;

class Animal {
    public void walk(){
        System.out.println("Animal Walking");
    }
}
public class AnonimousClassTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Dog walking");
            }
        }; //creating the Animal's subclasses
        animal.walk();

    }
}
