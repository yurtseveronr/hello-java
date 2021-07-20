package _07_exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Test {

    public static void main(String[] args) {

        try {
            System.out.println(5 / 0);
            System.out.println("Exception"); // If an exception occurs, this line won't work
        } catch (ArithmeticException arithmeticException) {
            System.out.println("An exception occurred!");
            arithmeticException.printStackTrace();
        } finally {
            System.out.println("Finally block always works");
        }

        Person person = new Person();
        person.setAge(-1); // throws a error

        try {
            Date date = printDate("2021-1-1");
            System.out.println(date);
        }
        catch (ParseException parseException) {
            parseException.printStackTrace();
        }

    }


    // As well as try-catch-finally blocks, we can use throws, invoking method must handle this exception.
    public static Date printDate(String dateAsText) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        return simpleDateFormat.parse(dateAsText);


    }

}