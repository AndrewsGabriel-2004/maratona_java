package maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        /* + - * / */
        int number01 = 10;
        int number02 = 30;
        int resultadoConta = (number01 * number02);

        System.out.println(resultadoConta);

        // % = resto
        int resto = 27 % 2;
        System.out.println(resto);

        // os lógicos retornam booleano = sempre true or false <> >= <= == !=
        boolean isTenBiggerthanTwenty = 10 > 20;
        System.out.println(isTenBiggerthanTwenty);;

        boolean isTenEqualTen = 10 == 10;
        System.out.println(isTenEqualTen);

    }
}