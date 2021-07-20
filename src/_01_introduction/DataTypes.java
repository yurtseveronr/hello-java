package _01_introduction;

public class DataTypes {

   /*
   * Primitive Types : boolean, char, byte, short,int,long,float,double
   * Non-primitive Types : classes,interfaces,enum,strings,arrays
    */

    public static void main(String[] args) {

        // Primitive Types and its declarations

        boolean b = false;

        char ch = 'a';

        byte byte_number = 120;

        int year = 2020;
        int number_binary = 0b010101011;
        int number_octal =  0244;
        int number_hexadecimal = 0xA2311;

        long long_year = 2020L;

        float number_float = 3.22f;
        double number_double = 3.22d;

        double result = Math.sin(2.83);


        // type casting
        /*
        Widening casting : byte->short->char->int->long->float->double
        Narrowing casting : double->float->long->int->char->short-byte
         */

        //widening casting
        int year_int = 2020;
        double year_double = year_int;
       
        //narrowing casting
        long a = 1200L;
        int c = (int) a;
        short d = (short) a;
        byte e = (byte) a;//data loss


        //constants -> we can declare
        final int number_constant=20;



    }
}
