package _01_introduction;

public class ControlFlows {

    public static void main(String[] args) {
        // If condition
        int number = 21;

        if(number % 2 == 0) {
            System.out.println("Number is even number");
        }
        else {
            System.out.println("Number is odd number");
        }

        int grade = 42;

        if(grade<25) {
            System.out.println("Grade is F");
        }
        else if(grade<40) {
            System.out.println("Grade is D");
        }
        else if (grade<60) {
            System.out.println("Grade is C");
        }

        else if (grade<70) {
            System.out.println("Grade is B");
        }
        else if(grade<80) {
            System.out.println("Grade is A");
        }

        //switch-case
        int day = 4 ;

        switch(day) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Hello Weekend");
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }


        // while loop
        System.out.println("Counting from 10");
        int counter = 10;
        while (counter>=0) {
            System.out.println(counter + " ");
            counter--;
        }


        // for loop
        for (int i = 0; i < 100; i++) {
            System.out.print(i+",");
        }

        for (int i = 0; i < 10; i+=3) {
            System.out.println(i);
        }

        // Continue
        for (int i = 0; i < 10; i++) {
            if(i==4) {
                continue;
            }
            System.out.println(i);
        }

        // Break
        for (int i = 0; i < 10; i++) {
            if(i==4) {
                break;
            }
            System.out.println(i);
        }


        // for-each loop
        int[] numbers = {1,2,3,4,5,6};

        for(int number_foreach : numbers) {
            System.out.println(number_foreach);
        }








    }









}
