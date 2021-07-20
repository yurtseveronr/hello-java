package _03.datetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;

public class LocalDateClass {

    public static void main(String[] args) {

        LocalDate localDate_now = LocalDate.now();
        System.out.println(localDate_now);

        LocalDate localDate_yesteday = LocalDate.now().minusDays(1);
        LocalDate localDate_tomorrow = LocalDate.now().plusDays(1);

        LocalDate localdate_previousMonth = LocalDate.now().minus(1,ChronoUnit.MONTHS);
        System.out.println(localdate_previousMonth);

        LocalDate localDate_userdefined = LocalDate.of(2020,12,12);
        System.out.println(localDate_userdefined);

        LocalDate localDate_parse = LocalDate.parse("2011-11-12");//string parse
        System.out.println(localDate_parse);

        System.out.println(localDate_now.isBefore(localDate_yesteday));
        System.out.println(localDate_now.isAfter(localDate_now));
        System.out.println(localDate_now.isEqual(LocalDate.now()));

        DayOfWeek dayOfWeek = localDate_now.getDayOfWeek();



    }
}
