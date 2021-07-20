package _09.lambda;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {

    public static void main(String[] args) {

        // Normally, we cannot take instance out of Interfaces.
        Operation addition = new Operation() {
            @Override
            public int operate(int x, int y) {
                return x+y;
            }
        };

        System.out.println(addition.operate(4, 5));

        Operation subtraction = new Operation() {
            @Override
            public int operate(int x, int y) {
                return x-y;
            }
        };

        System.out.println(subtraction.operate(5, 1));

        // Instead, we can use lambda expression.

        Operation addition_lambda = (x,y) ->  {
            System.out.println("Lambda expression");
            return x+y;
        };

        Operation subtraction_lambda = (x,y) -> {
            System.out.println("Lambda expression");
            return x-y;
        };

        Operation division = (x, y) -> x/y; // no need to return

        System.out.println(addition_lambda.operate(4,3));
        System.out.println(subtraction_lambda.operate(4,3));
        System.out.println(division.operate(2,1));

        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("Hello!");
        myFunctionalInterface.saySomething();

        // some built-in functional interfaces

        // Function Interface
        // Gets T as a parameter, converts this into R,returns R, apply method
        Function<String,Integer> function = str -> Integer.parseInt(str);
        System.out.println(function.apply("20"));

        // Consumer Interface
        // Has a method called accepts, gets T as a parameter, process, returns void,
        StringBuilder text = new StringBuilder();
        Consumer<String> consumer = str -> text.append(str);
        consumer.accept("This ");
        consumer.accept("is ");
        consumer.accept("Consumer interface");
        System.out.println(text.toString());

        // Supplier interface
        // Gets no parameter, returns T
        final int max = 100;
        Supplier<Integer> supplier = () -> {
            Random random = new Random();
            int number = random.nextInt(max);
            return number;
        };
        System.out.println(supplier.get());

        // Predicate interface
        // Has a method test, gets T as a parameter, return boolean type.
        Predicate<Integer> predicate = number -> number % 5 == 0;
        System.out.println(predicate.test(20));
        System.out.println(predicate.test(21));


        






    }
}
