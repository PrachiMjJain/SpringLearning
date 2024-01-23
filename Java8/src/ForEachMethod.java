import java.util.Arrays;
import java.util.List;

/* two type of loop
1. External loop:- outside of
*/

public class ForEachMethod {
    public static void main(String[] args){
        List<Integer> values = Arrays.asList(4,5,6,7,8);

        //1 way (for loop)
        for(int i=0; i<values.size(); i++){
            System.out.println(values.get(i));
        }

        // 2 way (foreach loop)
        for(int i: values){
            System.out.println(i);
        }

        // 2 way (forEach Method)
        values.forEach(i ->System.out.println(i));
    }
}
