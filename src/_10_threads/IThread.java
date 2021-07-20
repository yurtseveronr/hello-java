package _10_threads;

public class IThread implements Runnable{

    public final Thread thread ;

    public IThread() {
        thread = new Thread();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is working");


        try {
            System.out.println("Wait for 2 seconds!");
            Thread.sleep(2000);
            thread.setPriority(10);
            System.out.println("Thread's state : " + thread.getState());
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}
