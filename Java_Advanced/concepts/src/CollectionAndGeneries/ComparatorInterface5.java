// to sort the elements based on last number
package CollectionAndGeneries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorInterface5 {
    public static void main(String[] args){
        List<Integer> values = new ArrayList<>(); // list is mutable

        values.add(408);
        values.add(624);
        values.add(825);
        values.add(567);

        //Collections.sort(values);

        // to override sort() method
        //logic for comparator
      /*  Comparator<Integer> c = new Comparator<Integer>() {// we dont have any class which implements COmparator interface
            public int compare(Integer i , Integer j){
//                if(i % 10 > j % 10)
//                    return 1;
//                else
//                    return -1;
                return (i %10 > j%10) ? 1: -1;
            }
        };
        Collections.sort(values , c);

       */

        // through lambda

        Collections.sort(values , (i,j) ->(i %10 > j%10) ? 1: -1);



        for (Integer o : values) {
            System.out.println(o);
        }

    }
}
