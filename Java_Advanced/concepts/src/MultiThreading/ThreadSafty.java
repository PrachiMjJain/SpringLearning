package MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

class CounterThreadSafety {
    AtomicInteger count = new AtomicInteger();
    //int count;
    public synchronized void increment(){
        //count++; // count = count + 1;
        count.incrementAndGet();
    }
}

public class ThreadSafty {
    public static void main(String[] args) throws Exception{
        CounterThreadSafety c = new CounterThreadSafety();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=100; i++){
                    c.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=100; i++){
                    c.increment();
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);

    }
}
