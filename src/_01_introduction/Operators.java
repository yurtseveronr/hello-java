package _01_introduction;

public class Operators {

    public static void main(String[] args) {
        // Assignment operator
        int a = 4;
        int b = 3;

        // Arithmetic Operators
        int sum = a+b;
        int subtraction = a-b;
        int multiplication = a*b;
        int division = a/b;
        float division_double = (float) a/b;
        int modulus = a%b;
        a++;
        b--;

        a = a+3;
        a+=3;
        a*=3;
        a/=3;

        // Comparators
        boolean isequal = a==b;
        boolean notequal = a!=b;
        boolean greater_than = a>b;
        boolean less_than = a<b;
        boolean greater_equal_than = a>=b;
        boolean less_equal_then = a<=b;


        // Bitwise Operator
        int and = 5&1;
        int or = 5|1;
        int not = ~5;
        int left_shift = 9>>1;
        int right_shift = 9<<1;

        // Logical Operator
        if(a==0 || b==0) {
            int c=0;
        }

        if(a>0 && b>0) {
            int d = a*b;
        }

        boolean logical_not = false;
        if(!logical_not) {
            System.out.println(" ");
        }








    }
}
