package _10_threads;

public class CriticalSection {

    public synchronized void criticalSection() {

        Thread currentThread = Thread.currentThread();
        System.out.println("Active thread : " + currentThread.getName());


    }



}
