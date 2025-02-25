package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.PrinterStudant;
import maratonajava.javacore.Bintroducaometodos.dominio.Student;

public class StudentTest02 {
    public static void main(String[] args) {

        Student stu1 = new Student();
        Student stu2 = new Student();

        stu1.name = "Midorya";
        stu1.age = 15;
        stu1.gender = 'M';

        stu2.name = "Goku";
        stu2.age = 20;
        stu2.gender = 'M';

        stu1.print();
        stu2.print();


    }
}
