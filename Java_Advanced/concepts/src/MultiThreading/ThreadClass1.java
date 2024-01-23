package MultiThreading;

// to make class as thread
class hi extends Thread{
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
class hello extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("hello");
            // to suspend thread
            try{
                Thread.sleep(500);
            }catch(Exception e){

            }
        }
    }

}
public class ThreadClass1 {
    public static void main(String[] args){
        hi obj1 = new hi();
        hello obj2 = new hello();

        // to make class as thread
        obj1.start(); // start() internally run run() method
        try{
            Thread.sleep(10);
        }catch(Exception e){

        }
        obj2.start();


    }
}
