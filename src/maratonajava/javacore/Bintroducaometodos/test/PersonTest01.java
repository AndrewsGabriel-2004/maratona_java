package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Jiraya");
        person.setAge(50);

        person.print();

        //or

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
