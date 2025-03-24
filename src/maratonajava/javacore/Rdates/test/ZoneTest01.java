package maratonajava.javacore.Rdates.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        //ZoneID:
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds); //zones supported by JAVA
        System.out.println(ZoneId.systemDefault()); //OS Zone
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime1 = now.atZone(tokyoZone);
        System.out.println(zonedDateTime1);

        Instant nowInst = Instant.now();
        System.out.println(nowInst);
        ZonedDateTime zonedDateTime2 = nowInst.atZone(tokyoZone);
        System.out.println(zonedDateTime2); //already altered value on hour

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime2 = nowInst.atOffset(offsetManaus);
        System.out.println(offsetDateTime2);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate dateJapan = LocalDate.of(1900, 2, 11);
        JapaneseDate japaneseDate1 = JapaneseDate.from(dateJapan);
        System.out.println(japaneseDate1);
    }
}
