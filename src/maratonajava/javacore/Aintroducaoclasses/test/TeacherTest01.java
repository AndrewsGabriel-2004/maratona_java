package maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.javacore.Aintroducaoclasses.dominio.Teacher;

public class TeacherTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        teacher.age = 20;
        teacher.name = "Andrews";
        teacher.gender = 'M';

        System.out.println(teacher.name +" "+ teacher.age +" "+ teacher.gender +" ");

    }
}
