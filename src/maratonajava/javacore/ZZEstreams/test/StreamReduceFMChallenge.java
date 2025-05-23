package maratonajava.javacore.ZZEstreams.test;

import java.util.List;

public class StreamReduceFMChallenge {
    static class  Person{
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Andrews Gabriel",20),
                new Person("William Suane", 14),
                new Person("Andriely Soares", 40),
                new Person("Miguel Nonato", 30),
                new Person("João Pessoa",50),
                new Person("Fernando Carlos",11),
                new Person("Hugo Calderano", 13)
        );

        boolean allMatch = people.stream()
                .map(Person::getAge)
                .allMatch(age -> age >= 18);
        System.out.println("Everyone are in legal age? " + allMatch);

        people.stream()
                .filter(person -> person.getAge() < 18)
                .findAny()
                .ifPresent(System.out::println);

        people.stream()
                .map(Person::getAge)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }
}
