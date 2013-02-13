package sorting;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sleepsort {
    static final CountDownLatch latch = new CountDownLatch(10);

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (Runnable runnable: Arrays.asList(sleep(5), sleep(2), sleep(9), sleep(1), sleep(3), sleep(8), sleep(6), sleep(7), sleep(10), sleep(4)))
            service.submit(runnable);
        latch.await();
        System.out.println("Finished sorting");
    }

    private static Runnable sleep(final int i) {
        return new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(i * 1000);
                } catch (InterruptedException e) {
                    return;
                }
                System.out.println(i);
                latch.countDown();
            }
        };
    }
}
