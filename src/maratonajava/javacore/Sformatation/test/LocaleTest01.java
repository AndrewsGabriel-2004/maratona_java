package maratonajava.javacore.Sformatation.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        //pt-BR
        Locale localeItaly = new Locale("it", "IT");
        Locale localeSwitz = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeDutch = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,localeSwitz);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL,localeJapan);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL,localeDutch);

        System.out.println("Italy: "+ df1.format(calendar.getTime()));
        System.out.println("Switzerland: "+ df2.format(calendar.getTime()));
        System.out.println("Indie: "+ df3.format(calendar.getTime()));
        System.out.println("Japan: "+ df4.format(calendar.getTime()));
        System.out.println("Netherlands: "+ df5.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeIndia)); //language from OS
        System.out.println(localeSwitz.getDisplayCountry(localeJapan));
    }
}
