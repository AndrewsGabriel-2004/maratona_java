package maratonajava.javacore.Sformatation.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String string1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String string2 = date.format(DateTimeFormatter.ISO_DATE); //pattern + offset
        String string3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE); //pattern, without offset
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);

        LocalDate parse1 = LocalDate.parse("20250323",DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2025-03-23+05:00",DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2025-03-23",DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String string4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(string4);

        LocalDateTime parse4 = LocalDateTime.parse("2025-03-23T16:34:52.9674026");
        System.out.println(parse4);
        //dd/mm/yyyy
        //mm/dd/yyyy
        //yyyy/mm//dd
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate date1 = LocalDate.parse("23/02/2021", formatterBR);
        System.out.println(date1);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.CANADA);
        String formatGR = LocalDate.now().plusMonths(7).format(formatterGR);
        System.out.println(formatGR);

        LocalDate date2 = LocalDate.parse("19.February.2021", formatterGR);
        System.out.println(date2);
    }
}
