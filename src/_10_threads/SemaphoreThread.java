package _10_threads;

import java.util.concurrent.Semaphore;

public class SemaphoreThread extends Thread {

    private Semaphore semaphore  = new Semaphore(1);
    private CriticalSection criticalSection = new CriticalSection();

    @Override
    public void run() {

        // entering critical section
        try {
            semaphore.acquire(); // permit--
            criticalSection.criticalSection();
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        finally {
            semaphore.release(); // permit++
        }


    }
}
