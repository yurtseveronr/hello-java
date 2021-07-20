package _04_strings;

import java.util.Arrays;

public class StringClass {

    public static void main(String[] args) {

        String name = "Onur"; //literal definition
        String surname = new String("Yurtsever");

        // String Pool
        String s1 = "Onur";
        String s2 = "Onur";
        //same address in string pool

        String s3 = "Yurtsever";

        String s4 = new String("Onur");

        String s5 = new String("Onur");

        char[] char_array = {'a','b','c'};
        String s6 = new String(char_array);

        //String Compare
        /*
        * == operator -> compares address
        * equals() method + equalsIgnoreCase() method -> compares content
        * compareTo method -> compares values lexicographically
         */


        boolean s1ands2 = s1==s2; //true, same address in string pool
        System.out.println(s1ands2);

        boolean s2ands3 = s2==s3;
        System.out.println(s2ands3);

        boolean s2ands4 = s2==s4;//false, different address in string pool even though same value
        System.out.println(s2ands4);

        boolean equals = s1.equals(s2);
        System.out.println(equals);

        boolean equals1 = s1.equals(s5);
        System.out.println(equals1);

        int compareTo = s2.compareTo(s4);
        System.out.println(compareTo);

        // Merging String -> + or concat
        String name_surname_plus = name+" "+surname;
        System.out.println(name_surname_plus);

        String name_surname_concat = name.concat(" "+surname);
        System.out.println(name_surname_concat);

        //Start with - ends with
        String starts_ends_with = "Start and ends with";
        System.out.println(starts_ends_with.startsWith("St"));
        System.out.println(starts_ends_with.endsWith("a"));

        //CharAt
        System.out.println(starts_ends_with.charAt(1));
        System.out.println(starts_ends_with.charAt(3));

        //length
        int length = s1.length();
        System.out.println(length);

        // indexOf - lastIndexOf
        System.out.println(s2.indexOf("a"));
        System.out.println(s2.indexOf("r",2));
        System.out.println(s2.lastIndexOf("o"));
        System.out.println(s2.lastIndexOf("o", 2));

        // lowerCase - upperCase
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());

        // trim
        System.out.println(s2.trim());

        // turn strings into arrays for streaming
        byte[] byte_array = s2.getBytes();
        System.out.println(Arrays.toString(byte_array));

        // numbers to string
        int number = 21;
        String number_string = String.valueOf(number);
        System.out.println(number_string);

        String substring = s3.substring(1);
        String substring_index = s3.substring(2,4);

        // string formatting
        int speed = 50;
        String departureCity = "Istanbul";
        String arrivalCity = "Izmir";
        String fullText = String.format("Average velocity : %d from %s to %s",speed,departureCity,arrivalCity);
        System.out.println(fullText);

    }
}
