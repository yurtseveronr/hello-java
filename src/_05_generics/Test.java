package _05_generics;

import _02_oop.Animal;
import _02_oop.Fish;
import _02_oop.Insects;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        //instead of creating new class for every type, we can use Object class.
        //This solves our problem.
        //But that doesn't provide type-safety,
        MyObjectClass myObjectClass = new MyObjectClass();
        myObjectClass.addItem(1);
        myObjectClass.addItem("Onur");
        myObjectClass.addItem('a');
        myObjectClass.addItem(true);
        myObjectClass.addItem(1.0);

        MyGenericClass<Integer> myGenericClass = new MyGenericClass<>();
        myGenericClass.addItem(1);
        myGenericClass.addItem(2);
        myGenericClass.addItem(3);
        myGenericClass.addItem(4);
       // myGenericClass.addItem("Onur");->error
        myGenericClass.addItem(5);

       MyGenericClass<String> myGenericClass1 = new MyGenericClass<>();
       myGenericClass1.addItem("1");
       myGenericClass1.addItem("2");
       myGenericClass1.addItem("3");
       myGenericClass1.addItem("4");
       myGenericClass1.addItem("5");
       //myGenericClass1.addItem(1);->error

        //Wrapper Classes and Boxing - Autoboxing - Unboxing

        int number = 22;
        Integer wrapper_number_new = new Integer(number);

        //Autoboxing -> primitive to wrapper automatically
        int a = 21;
        Integer wrapper = a;

        //Unboxing -> wrapper to primitive
        Integer wrapper_number = 24;
        int b = wrapper_number;

        Integer wrapper_unboxing = new Integer(22);

        // we can declare number and its subclasses
        UpperBounded<Float> floatUpperBounded = new UpperBounded<>();
        floatUpperBounded.addItem(4.6f);
        floatUpperBounded.addItem(5.2f);
        floatUpperBounded.addItem(9.7f);
        floatUpperBounded.addItem(51.22f);
        floatUpperBounded.addItem(78.22f);
        //floatUpperBounded.addItem("5.2f");->error

        UpperBounded<Integer> integerUpperBounded = new UpperBounded<>();
        integerUpperBounded.addItem(1);
        integerUpperBounded.addItem(6);
        integerUpperBounded.addItem(88);
        integerUpperBounded.addItem(54);
        integerUpperBounded.addItem(28);

        UpperBounded<Number> numberUpperBounded = new UpperBounded<>();
        numberUpperBounded.addItem(21f);
        numberUpperBounded.addItem(67d);
        numberUpperBounded.addItem(34);
        numberUpperBounded.addItem(0);
        numberUpperBounded.addItem(89);


        /*
        * Upper Bound Wildcard -> ? extends Type
        * Lower Bound Wildcard -> ? super Type
        * Unbounded Wildcard -> ?
         */
    }

    //lower bounded
    public static void addAnimal (ArrayList<? super Animal> list) {

        list.add(new Fish());

        list.add(new Insects());
        
        

    }





}

