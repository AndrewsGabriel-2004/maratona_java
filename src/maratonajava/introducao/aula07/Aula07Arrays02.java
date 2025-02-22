package maratonajava.introducao.aula07;

public class Aula07Arrays02 {
    int age;
    public static void main(String[] args) {
        // byte,short,long,int 0
        // char '\u0000' ' '
        // string null
        //boolean false

        boolean [] age = new boolean[10];
        System.out.println(age[0]);

        String [] name = new String[4];

        name[0] = "Arrascaeta!";
        name[1] = "Gabigol!";
        name[2] = "Gerson!";

        for(int i= 0;i < name.length; i++){

            System.out.println(name[i]);

        }

    }
}
