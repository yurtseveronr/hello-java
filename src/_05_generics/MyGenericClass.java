package _05_generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyGenericClass<T> {

    public T value;
    public Object [] array = new Object[5];
    public int count = 0;

    public void addItem(T item) {

        if(count>5) {
            System.out.println("List is full!");
        }

        array[count] = item;
        count++;
    }

    // T[] array = new T[] -> error

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    //generic methods -> list is dynamic array
    public <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }


}
