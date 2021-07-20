package _01_introduction;

public class Scope {

    int a = 4;

    public static void main(String[] args) {

        // a is reachable

        int b = 3;
        // a and b are reachable

        if(b>5) {
            int c = 2;
            //a,b and c are reachable
        }
        // a and b are reachable

        {
            int c = 0;
            //a,b and c are reachable
        }
        // a and b are reachable

    }
            // a is reachable




}
