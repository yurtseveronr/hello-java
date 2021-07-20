package _07_exceptions;

public class MyExceptionClass extends RuntimeException {

    public MyExceptionClass() {
        // unchecked exception
        super("This is my exception class!");
    }


}
