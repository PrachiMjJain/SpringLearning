// Set is unordered and ni duplicate value allow
package CollectionAndGeneries;

import java.util.Set;
import java.util.TreeSet;

public class SetInterface7 {
    public static void main(String[] args){
        //Set<Integer> values = new HashSet<>();


        //to store in aseconding order we can use TreeSet
        Set<Integer> values = new TreeSet<>();


        values.add(7);
        values.add(3);
        values.add(8);
       // values.add(7); // it will not added to set

        for (int i : values){
            System.out.println(i);
        }

    }
}
