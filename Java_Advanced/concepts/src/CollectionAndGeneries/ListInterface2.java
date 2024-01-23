package CollectionAndGeneries;

import java.util.*;

// To use indexing and add value in mid List is there
public class ListInterface2 {
    public static void main(String[] args){
        List values = new ArrayList();

        // to add values
        values.add(4); // these are wrapper class object
        values.add(6);
        values.add(8);
        // in List this function can add element on index basis
        values.add(1 ,2);

        System.out.println(values);  // [4, 6, 8]

        // Iterator(interface) use for fetching values one by one but since list is ordered
//        for(int i=0; i<values.size(); i++){
//            System.out.println(values.get(i));
//        }
        for(Object o:values){
            System.out.println(o);
        }

        // type of iteration : Iterator and ListIterator
        // if one by one through Iterator :- 3 method :-  hasNext() , remove() , next()
        Iterator it = values.iterator();
        while (it.hasNext()){
            // hasNext() will return boolean
            System.out.println(it.next());
        }
        // through ListIterator : has 4 methods :- hasNext() , next() , hasPrevious() , remove()

    }
}
