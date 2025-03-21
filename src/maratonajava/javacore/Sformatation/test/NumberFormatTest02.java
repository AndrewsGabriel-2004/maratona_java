package maratonajava.javacore.Sformatation.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getCurrencyInstance();
        nf[1] = NumberFormat.getCurrencyInstance(localeBR);
        nf[2] = NumberFormat.getCurrencyInstance(localeJP);
        nf[3] = NumberFormat.getCurrencyInstance(localeIT);
        double value = 1_000.2130;
        for(NumberFormat nfa : nf){
            nfa.setMaximumFractionDigits(3);
            System.out.println(nfa.getMaximumFractionDigits()); //fraccionary digit
            System.out.println(nfa.format(value));
        }

        String valueString = "R$ 1.000,213";
        try {
            System.out.println(nf[0].parse(valueString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
