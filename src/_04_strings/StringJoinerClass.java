package _04_strings;

import java.util.StringJoiner;

public class StringJoinerClass {

    public static void main(String[] args) {
        
        StringJoiner letters = new StringJoiner(",");
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        System.out.println(letters.toString());

        System.out.println(letters.length());


    }
}
