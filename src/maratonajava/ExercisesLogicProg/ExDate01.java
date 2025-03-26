package maratonajava.ExercisesLogicProg;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class ExDate01 {
    public static void main(String[] args) {
        //dd/MM/yyyy HH:mm:ss
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        //or
        LocalDateTime date1 = LocalDateTime.now();
        String s1 = date1.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s1);
        //or
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("'Date: 'dd/MM/yyyy 'Time: ' HH:mm:ss");
        String format = LocalDateTime.now().format(dateTimeFormatter);
        System.out.println(format);

        String pattern = "'João Pessoa dia ' dd ' de ' MMMM ' de 'yyyy HH:mm";
        SimpleDateFormat sdf1 = new SimpleDateFormat(pattern);
        Calendar c = Calendar.getInstance();
        System.out.println(sdf1.format(c.getTime()));
    }
}
