package homeWork7;

import java.time.*;

public class Dates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 1, 2);
        LocalTime time = LocalTime.of(13, 20);
        LocalDateTime dt = LocalDateTime.of(date, time);
        ZonedDateTime zdt = ZonedDateTime.of(date, time, ZoneId.systemDefault());

        LocalDateTime plusOneMinute = dt.plusMinutes(1);
        LocalDateTime PlusOneHour = dt.plusHours(1);
        LocalDateTime PlusOneDay = dt.plusDays(1);
        LocalDateTime PlusOneMonth = dt.plusYears(1);
        System.out.println(plusOneMinute);
        System.out.println(PlusOneHour);
        System.out.println(PlusOneDay);
        System.out.println(PlusOneMonth);
    }

}
