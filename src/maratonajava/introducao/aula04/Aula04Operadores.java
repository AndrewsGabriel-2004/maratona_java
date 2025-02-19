package maratonajava.introducao.aula04;

public class Aula04Operadores {
    public static void main(String[] args) {

        /* + - * / */
        int number01 = 10;
        int number02 = 30;
        int resultadoConta = (number01 * number02);

        System.out.println(resultadoConta);

        // % = rest
        int resto = 27 % 2;
        System.out.println(resto);

        // os lógicos retornam booleano = sempre true or false <> >= <= == !=
        boolean isTenBiggerthanTwenty = 10 > 20;
        System.out.println(isTenBiggerthanTwenty);;

        boolean isTenEqualTen = 10 == 10;
        System.out.println(isTenEqualTen);

        //&& = END // || = OR //  ! = NOT Logic Operators
        double salary = 3500;
        int age = 29;
        boolean isRightWithLawGreaterThanThirty = age > 30 && salary >= 4612;
        boolean isRightWithLawLessThanThirty = age < 30 && salary >= 3381;

        System.out.println("isRightWithLawGreaterThanThirty " + isRightWithLawGreaterThanThirty);
        System.out.println("isRightWithLawLessThanThirty " + isRightWithLawLessThanThirty);

        double totalValueCheckingAccount = 200.0;
        double totalValueSavingAccount = 10000.0;
        double playStationValue = 5000.0;
        boolean isPlayStation5purchasable = totalValueCheckingAccount > playStationValue || totalValueSavingAccount > playStationValue;

        System.out.println("isPlayStation5purchasable " + isPlayStation5purchasable);

        // == += -= *= /= %= Attributions Operators

        double bonus = 1800.0;
        bonus += 1000.0;
        // bonus *= 2; bonus = 3600
        // bonus %= 2; bonus = 0
        // bonus++; bonus = 1801.0
        // bonus--; bonus = 1799.0
        System.out.println(bonus);

        // bonus++ => firstly print bonus, and in the next line increase one more in bonus
        // ++bonus => already increase one more in the print of bonus

    }
}