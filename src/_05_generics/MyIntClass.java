package _05_generics;

import java.util.Arrays;

public class MyIntClass {

    public int [] array = new int[5];
    public int count = 0;

    public void addItem(int item) {

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
