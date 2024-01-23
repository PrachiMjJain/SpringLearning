package MultiThreading;

public class JoinAndisAliveMethod4 {
    public static void main(String[] args) throws Exception{
        Thread t1 = new Thread(() -> {
            for(int i=1; i<=5; i++){
                System.out.println("hi");
                try{Thread.sleep(1000);}catch(Exception e){}
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i=1; i<=5; i++){
                System.out.println("hello");

                try{Thread.sleep(1000);}catch(Exception e){}
            }
        });

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
