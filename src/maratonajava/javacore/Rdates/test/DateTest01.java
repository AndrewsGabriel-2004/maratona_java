package maratonajava.javacore.Rdates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(); //long represent mileessecond representing the date since 1 january 1970's
        date.setTime(date.getTime() + 3600000);
        System.out.println(date);
    }
}
