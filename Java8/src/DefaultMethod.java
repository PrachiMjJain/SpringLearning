interface Phone{

    // by default, it is public static
    void call();

    // default method
    default void message(){
        System.out.println("sent");
    }
}
// Don't make public else it will ask for making different .java file.
class AndroidPhone implements Phone {

    public void call() {
        System.out.println("Calling");
    }
}


public class DefaultMethod {
    public static void main(String[] args){
        Phone p = new AndroidPhone();
        p.call();
        p.message();
    }
}
