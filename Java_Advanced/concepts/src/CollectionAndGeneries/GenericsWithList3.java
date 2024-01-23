package CollectionAndGeneries;

import java.util.ArrayList;
import java.util.List;

public class GenericsWithList3 {
    public static void main(String[] args){
        //List<Integer> values = new ArrayList<Integer>(); // 1.5
        List<Integer> values = new ArrayList<>(); // 1.7

        values.add(4);
        values.add(6);
        values.add(8);
        // in List this function can add element on index basis
        values.add(1 ,2);

        for(Integer o:values){
            System.out.println(o);
        }

    }
}
