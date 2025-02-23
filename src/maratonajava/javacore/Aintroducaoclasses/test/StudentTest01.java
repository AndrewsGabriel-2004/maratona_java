package maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.javacore.Aintroducaoclasses.dominio.Studant;

public class StudentTest01 {
    public static void main(String[] args) {

        Studant studant = new Studant();
            //reference variable    //object

        studant.name = "Andrews Gabriel";
        studant.age = 20;
        studant.gender = 'M';

        System.out.println(studant.age);
        System.out.println(studant.gender);
        System.out.println(studant.name);




    }
}
