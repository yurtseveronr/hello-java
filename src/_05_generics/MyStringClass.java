package _05_generics;

import java.util.Arrays;

public class MyStringClass {

    public String [] array = new String[5];
    public int count = 0;

    public void addItem(String item) {

        if(count>5) {
            System.out.println("List is full!");
        }

        array[count] = item;
        count++;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
