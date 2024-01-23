package MultiThreading;

public class ThreadPriority5 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for(int i=1; i<=5; i++){
                System.out.println("hi");
                try{Thread.sleep(1000);}catch(Exception e){}
            }
        }, "second way to chnag ethe name of thread");
        Thread t2 = new Thread(() -> {
            for(int i=1; i<=5; i++){
                System.out.println("hello");

                try{Thread.sleep(1000);}catch(Exception e){}
            }
        });

        // THREAD Priority
        /*
        Range of priority is 1(lowest priority) to 10(highest Priority)
         */
        t1.setPriority(1);
        t2.setPriority(10);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        // to change thread name
        // 1 way
//        t1.setName("Hi Thread");
//        t2.setName("Hello Thread");
        // 2 way to chnage the name of thread
//        Thread t1 = new Thread(() -> {
//            for(int i=1; i<=5; i++){
//                System.out.println("hi");
//                try{Thread.sleep(1000);}catch(Exception e){}
//            }
//        }, "second way to chnag ethe name of thread");
        // to print name of thread
//        System.out.println(t1.getName());
//        System.out.println(t2.getName());

        t1.start(); // start() internally run run() method
        try{Thread.sleep(10);
        }catch(Exception e){}
        t2.start();

        // to make wait to main thread , so thread t1 and t2 can complete their task we use join()
        t1.join();
        t2.join();

        // to check if thread is alive or not
        System.out.println(t1.isAlive());

        // NOTE:- by default we have main thread
        System.out.println("Bye");
    }
}
