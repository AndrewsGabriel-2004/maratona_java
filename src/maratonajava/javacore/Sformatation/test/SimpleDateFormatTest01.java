package maratonajava.javacore.Sformatation.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'João Pessoa' dd 'de' MMMM 'de' yyyy"; //'' what a want to ignore
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        System.out.println(sdf.format(new Date()));

        Calendar c = Calendar.getInstance();
        System.out.println(sdf.format(c.getTime()));
    }
}
