package maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterYears = LocalDate.now().plusYears(2).plusDays(7);
        Period p1 = Period.between(now, nowAfterYears);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58); //406 days
        Period p4 = Period.ofMonths(3);
        Period p5 = Period.ofYears(3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3); //pass week to day
        System.out.println(p4); //return month
        System.out.println(p5); //return years
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.DAYS));
    }
}
