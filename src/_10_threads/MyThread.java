package _10_threads;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is working");
    }
}
