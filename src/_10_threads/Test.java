package _10_threads;

public class Test {


    public static void main(String[] args) throws InterruptedException {


       Thread thread1 = new Thread(new IThread());
       thread1.start();

       Thread thread = new Thread(new MyThread());
       thread.start();

       /*

        Thread thread2   = new Thread(
                () -> System.out.println("New Thread")
        );

      */









    }






}
