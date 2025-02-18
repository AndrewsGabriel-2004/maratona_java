package maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        // int,double,char,float,byte,short,long,boolean

        System.out.println("Ola´");

        boolean falso = false;
        boolean verdadeiro = true;

        short ageShort = 32000;
        byte ageByte = 127;

        double salaryDouble = 2000.0;
        float salaryFloat = 2500.0f;

        int age = 10;
        long numberLong = (long) 155.23;

        char caractere = '\u0041';

        String nome1 = "Andrews Gabriel Pontes de Oliveira.";

        System.out.println("Andrews's age is " + age + " years old.");
        System.out.println(verdadeiro);
        System.out.println("char " + caractere);
        System.out.println(numberLong);
        System.out.println("Oi, meu nome é " + nome1);

    }
}
