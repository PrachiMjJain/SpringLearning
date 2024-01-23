package CollectionAndGeneries;
/*
Iterator has 3 methods : hasNext() , remove() , next()
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorInterface1 {
    public static void main(String[] args){
        // Collection is interface and ArrayList is class which implements Collection
        Collection values = new ArrayList();

        // to add values
        values.add(4);
        values.add(6);
        values.add(8);

        System.out.println(values);  // [4, 6, 8]

        // Iterator(interface) use for fetching values one by one
        Iterator it = values.iterator();
        while(it.hasNext()) {   // hasNext() will return boolean
            System.out.println(it.next());
        }
    }
}
