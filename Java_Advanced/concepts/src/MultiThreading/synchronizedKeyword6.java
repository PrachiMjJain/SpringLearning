package MultiThreading;

class Counter{
    int count; // 1 2 3 4  lets 600 (both fetching the vlaue)
    public synchronized  void increment(){
        count++; // count = count +1
    }
}
public class synchronizedKeyword6  {
    public static void main(String[] args) throws Exception{
        CounterThreadSafety c = new CounterThreadSafety();
//        c.increment();
//        System.out.println("count " + c.count); // count 1


//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i=1; i<=1000; i++){
//                    c.increment();
//                }
//            }
//        });
//        t1.start();
//
//        //to tell main that lets just complete the task to t1
//        t1.join(); // asking to main thread to wait
//        System.out.println("Count with Thread " + c.count);



        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=1000; i++){
                    c.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=1000; i++){
                    c.increment();
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Count with both thread" + c.count); // >2000 bcz both are fetching the value at same time so make work with fucntion one thread at a time use synchornized keyword
    }

}
