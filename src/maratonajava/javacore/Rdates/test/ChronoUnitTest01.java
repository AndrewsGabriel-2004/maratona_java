package maratonajava.javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(2004, Month.SEPTEMBER, 23,10,10,0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(birthday,now));
        System.out.println(ChronoUnit.DECADES.between(birthday,now));
        System.out.println(ChronoUnit.HOURS.between(birthday,now));
        System.out.println(ChronoUnit.MONTHS.between(birthday,now));
    }
}
