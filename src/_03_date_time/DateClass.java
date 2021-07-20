package _03_date_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

    public static void main(String[] args) throws ParseException {

        Date now = new Date();
        System.out.println(now.toString());

        Date date_userdefined = new Date(24*60*60*1000); // after 1st january 1970
        System.out.println(date_userdefined.toString());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss:SSS");
        Date date1 = new Date();
        System.out.println(simpleDateFormat1.format(date1));

         String dateAsText = "2020-12-12";
         SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
         Date date2 = simpleDateFormat2.parse(dateAsText);//throws ParseException, go to exception handling
         System.out.println(date2);

         boolean after = date.after(date1);
         boolean before = date.before(date2);
         boolean equals = date.equals(date2);
         int compare = date.compareTo(date_userdefined);
         long duration_time = date.getTime();
         date.setTime(11111111); // after 1st january 1970







    }
}
