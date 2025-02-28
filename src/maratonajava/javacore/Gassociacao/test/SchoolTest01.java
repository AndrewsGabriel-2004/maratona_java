package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.domain.School;
import maratonajava.javacore.Gassociacao.domain.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Jiraya Sensei");
        Teacher teacher2 = new Teacher("Kakashi Sensei");
        Teacher[] teachers = {teacher1,teacher2};
        School school = new School("Konoha");

        school.setTeachers(teachers);

        school.print();

    }
}
