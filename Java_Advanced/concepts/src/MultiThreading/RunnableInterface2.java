package MultiThreading;

// to achieve multiple inheritance in thread we use RUnnable Interface
class hi1 implements Runnable{
    public void run() {
        for(int i=1; i<=5; i++){
            System.out.println("hi");
            // to suspend thread
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
        }
    }
}
class hello1 implements Runnable{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("hello");
            // to suspend thread
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
        }
    }

}
public class RunnableInterface2 {
    public static void main(String[] args) {
        Runnable obj1 = new hi1();
        Runnable obj2 = new hello1();

        // to make class as thread
       //NOTE:- start() method is present in Thread class only


       Thread t1 = new Thread(obj1); // to link run() method of own class use object as parameter
       Thread t2 = new Thread(obj2);

        t1.start(); // start() internally run run() method
        try{Thread.sleep(10);
        }catch(Exception e){}
        t2.start();
    }
}