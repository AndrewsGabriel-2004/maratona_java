package maratonajava.javacore.Sformatation.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTes01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] dateFormat = new DateFormat[7];
        dateFormat[0] = DateFormat.getInstance(); //By OperationSystem
        dateFormat[1] = DateFormat.getDateInstance(); //return just the date
        dateFormat[2] = DateFormat.getTimeInstance(); //return just hour
        dateFormat[3] = DateFormat.getDateInstance(DateFormat.SHORT); //just / date
        dateFormat[4] = DateFormat.getDateInstance(DateFormat.MEDIUM); //day month year
        dateFormat[5] = DateFormat.getDateInstance(DateFormat.LONG); //day month year completly
        dateFormat[6] = DateFormat.getDateInstance(DateFormat.FULL); //day, month year hyper completly

        for (DateFormat dateFormat1 : dateFormat) {
            System.out.println(dateFormat1.format(calendar.getTime()));
        }
        DateFormat c = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(c.format(calendar.getTime()));
    }
}
