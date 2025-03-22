package maratonajava.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.with(ChronoField.DAY_OF_MONTH, 22);
        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        now = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.FRIDAY));
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());


    }
}
