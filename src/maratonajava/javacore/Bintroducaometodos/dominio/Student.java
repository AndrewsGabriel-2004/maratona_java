package maratonajava.javacore.Bintroducaometodos.dominio;

public class Student {
        public String name;
        public char gender;
        public int age;

        public void print(){          //im in the Student's object, and here is where I suppose to put my method
                System.out.println(this.name);
                System.out.println(this.age);
                System.out.println(this.gender);
        }
}
