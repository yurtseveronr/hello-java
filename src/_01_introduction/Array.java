package _01_introduction;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        //array declarations

        int[] numbers_array = new int[5];
        numbers_array[0] = 1;
        numbers_array[1] = 2;
        numbers_array[2] = 3;
        numbers_array[3] = 4;
        numbers_array[4] = 5;

        int[] numbers_array2 = {1,2,3,4,5};

        // get arrays write to console
        System.out.println(Arrays.toString(numbers_array));
        System.out.println(Arrays.toString(numbers_array2));

        // array.length
        for (int i = 0; i < numbers_array.length; i++) {
            System.out.println(numbers_array[i]);
        }

        // sorting
        Arrays.sort(numbers_array);
        Arrays.sort(numbers_array2);


        // binary search (valid for sorted arrays)
        int index = Arrays.binarySearch(numbers_array,1);
        int index2 = Arrays.binarySearch(numbers_array2,5);
        System.out.println(index);
        System.out.println(index2);

        // copying
        int[] copy_array = Arrays.copyOf(numbers_array,5);
        int[] copy_array2 = Arrays.copyOf(numbers_array2,3);
        int[] copy_array3 = Arrays.copyOfRange(numbers_array,0,4);

        // comparing two arrays
        boolean isequal = Arrays.equals(numbers_array,numbers_array2);
        System.out.println(isequal);

        // multidimensional arrays

        int [][] two_dimensional_array = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                two_dimensional_array[i][j] = 1;
            }
        }



    }
}
