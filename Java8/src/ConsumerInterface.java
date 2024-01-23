import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;


// 1 way through class implements
/*
class ConsumerImplementation implements Consumer<Integer>{

    @Override
    public void accept(Integer i) {
        System.out.println("Hello class implementation " + i);
    }
}

 */


public class ConsumerInterface {
    public static void main(String[] args){
        List<Integer> values = Arrays.asList(4,5,6,7,8);

        /* 1 way
        Consumer<Integer> c = new ConsumerImplementation();
        values.forEach(c);
         */

        /* 2 way
        Consumer<Integer> c = new Consumer<Integer>() {

            @Override
            public void accept(Integer i) {
                System.out.println("Hello anonymous class with consumer interface  " + i);
            }
        };
        values.forEach(c);
         */

        // 3 way

        values.forEach(i ->System.out.println(i)); // lambda with consumer Interface
    }
}
