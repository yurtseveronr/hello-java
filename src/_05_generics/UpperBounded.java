package _05_generics;

import java.util.Arrays;

public class UpperBounded <T extends Number> {

    T value;
    public Object [] array = new Object[5];
    public int count = 0;

    public void addItem(T item) {

        if(count>5) {
            System.out.println("List is full!");
        }

        array[count] = item;
        count++;
    }

    @Override
    public String toString() {
        return Arrays.toString(array); }








}
