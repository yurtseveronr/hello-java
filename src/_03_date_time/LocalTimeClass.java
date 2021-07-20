package _03.datetimeapi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeClass {

    public static void main(String[] args) {

        LocalTime localTime_now = LocalTime.now();
        System.out.println(localTime_now);

        LocalTime definedTime = localTime_now.minusHours(1).minusMinutes(21).minusSeconds(25);
        System.out.println(definedTime);

        LocalTime definedTime2 = localTime_now.minus(1,ChronoUnit.HOURS).minus(58,ChronoUnit.SECONDS);
        System.out.println(definedTime2);

        LocalTime definedTime3 = localTime_now.plus(2,ChronoUnit.HOURS);
        System.out.println(definedTime3);

        String hour = "08.19";
        LocalDate localDate_parse = LocalDate.parse(hour);
        System.out.println(localDate_parse);





    }
}
