package maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10;
        float floatP = 10F;
        double doubleP = 10D;
        boolean booleanP = false;
        char charP = 'W';

        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Boolean booleanW = false;
        Character charW = 'W';

        int i = intW; //unboxing

        Integer intW2 = Integer.parseInt("1");
        booleanW = Boolean.parseBoolean("TrUe");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isDigit('B'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));



    }
}
