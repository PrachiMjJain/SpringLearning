package CollectionAndGeneries;

import java.util.*;

public class ListAndSet {
    public static void main(String[] args){
        // List And Set Difference
        List list = new ArrayList();
        //list.add(1,10); // indexOutOfBounds exception occur
        list.add(0 ,10);
        list.add(2);
        list.add(3);
        list.add(4);
        // duplicate is accepted
        list.add(2);
        System.out.println("List = " + list); // [10, 2, 3, 4, 2]
        // many null value accepted
        list.add(null);
        list.add(null);
        // type of iteration : Iterator and ListIterator
          // if one by one through Iterator
        Iterator it = list.iterator();
        while (it.hasNext()){
            // hasNext() will return boolean
            System.out.println("iterator = " + it.next());
        }
            // ListIterator
        ListIterator litr = list.listIterator();
        while(litr.hasNext()){
            System.out.println("ListIterator = " + litr.next());
        }



        Set set = new HashSet();
        set.add(100);
        set.add(200);
        set.add(500);
        // duplicate
        set.add(100); // it will not print this element again
        // one null value accepted
        set.add(null);
        set.add(null);
        System.out.println("Set = " + set); // [100, 500, 200]

        Iterator itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
