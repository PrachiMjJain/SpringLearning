package CollectionAndGeneries;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorAndListIterator {
    public static void main(String[] args){
        List list = new ArrayList();
        list.add(10);
        list.add("deepak");
        list.add("rahul");

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
