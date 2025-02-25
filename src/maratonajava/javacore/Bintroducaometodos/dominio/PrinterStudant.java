package maratonajava.javacore.Bintroducaometodos.dominio;

public class PrinterStudant {
    public void printer(Student student){
//Studant and Printter arein the same package, dont need imports

        System.out.println("---------------------");


        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);

        student.name = "Gohan";

    }
}
