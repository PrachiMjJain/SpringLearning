package CollectionAndGeneries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionsClass4 {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>(); // list is mutable

        values.add(408);
        values.add(624);
        values.add(825);
        values.add(567);

        // collections class used for sorting
        // in asending order
        Collections.sort(values);
        // in deseconding order
        Collections.reverse(values);
        Collections.shuffle(values);

        for (Integer o : values) {
            System.out.println(o);
        }
    }
}
