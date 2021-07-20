package _05_generics;

import java.util.Arrays;

public class MyObjectClass {

    public Object [] array = new Object[5];
    public int count = 0;

    public void addItem(Object item) {

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
