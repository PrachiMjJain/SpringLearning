package Java11;

import java.util.ArrayList;
import java.util.Arrays;

public class toArrayMethod {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);

        /* 1 way
        System.out.println(list);

        */

        /* java 11
        Integer[] arr = list.stream().toArray(size -> new Integer[size]);
        System.out.println(Arrays.toString(arr));

        //OR

        Integer[] arr2  = list.toArray(size -> new Integer[size]);
        System.out.println(Arrays.toString(arr2));


         */

        Integer[] arr2  = list.toArray(Integer[] :: new);
        System.out.println(Arrays.toString(arr2));



    }
}
