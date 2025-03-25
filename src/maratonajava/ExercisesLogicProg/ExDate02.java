package maratonajava.ExercisesLogicProg;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class ExDate02 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2004,9,23);
        LocalDate date2 = LocalDate.of(2025,9,27);
        Period period = Period.between(date1,date2);
        System.out.println("Days: " +period);

        //or
        //not with LocalDate
        LocalDateTime date3 = LocalDateTime.now();
        LocalDateTime date4 = LocalDateTime.now().plusYears(5).plusDays(5).plusMinutes(78);
        Duration duration = Duration.between(date3,date4);
        System.out.println(duration);
        //or
        System.out.println("Days: " + ChronoUnit.DAYS.between(date3,date4));
        System.out.println("Minutes: " + ChronoUnit.MINUTES.between(date3,date4));



    }
}
