package maratonajava.javacore.Bintroducaometodos.dominio;

public class PrinterStudant {
    public void printer(Studant studant){
//Studant and Printter arein the same package, dont need imports

        System.out.println(studant.name);
        System.out.println(studant.age);
        System.out.println(studant.gender);


    }
}
