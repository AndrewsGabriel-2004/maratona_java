package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.PrinterStudant;
import maratonajava.javacore.Bintroducaometodos.dominio.Studant;

public class StudantTest01 {
    public static void main(String[] args) {
        Studant stu1 = new Studant();
        Studant stu2 = new Studant();
        PrinterStudant printerStudant = new PrinterStudant();

        stu1.name = "Midorya";
        stu1.age = 15;
        stu1.gender = 'M';

        stu2.name = "Goku";
        stu2.age = 20;
        stu2.gender = 'M';

        printerStudant.printer(stu1);

        printerStudant.printer(stu2);


    }
}
