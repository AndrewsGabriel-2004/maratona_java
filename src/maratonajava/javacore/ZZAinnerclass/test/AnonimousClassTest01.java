package maratonajava.javacore.ZZAinnerclass.test;

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
        animal.walk();//dog walking
        Animal animal1 = new Animal();
        animal1.walk();//animal walking

    }
}
