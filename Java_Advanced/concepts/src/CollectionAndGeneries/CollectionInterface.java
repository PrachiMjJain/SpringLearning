package CollectionAndGeneries;
import java.util.ArrayList;
public class CollectionInterface {
    public static void main(String[] args){
        ArrayList arr1 = new ArrayList();
        arr1.add(10);
        arr1.add("Prachi");
        arr1.add('c');
        System.out.println(arr1); // [10, Prachi, c]

        System.out.println(arr1.add("Jain")); // true
        System.out.println(arr1); // [10, Prachi, c, Jain]
//
//        // contains() :  to check whether that object is present in COllection object or not
//        System.out.println(arr1.contains('c')); // true
//
//        // isEmpty()
//        System.out.println(arr1.isEmpty()); // false
//
//        // size()
//        System.out.println(arr1.size());
//
//        // remove(int index )
//        arr1.remove(0);
//        System.out.println(arr1);
//        // remove(Object o)
//        arr1.remove("Prachi");
//        System.out.println(arr1);
//
//        // we can use
//        /*
//        List list = new ArrayList();
//        Set set = new HashSet();
//         */
//
//
//        // if we want to add all elements or object to one collection object to another collection object.
        ArrayList arr2 = new ArrayList();
        arr2.add(10);
        arr2.add("bc");
        arr2.add("cd");

        System.out.println(arr2); // [ab, bc, cd]
        arr1.addAll(arr2);
       System.out.println(arr1); // [ab, bc, cd]
//
//
//        //removeall()
//        arr1.removeAll(arr2);
//        System.out.println(arr1); // [c, Jain]
//        System.out.println(arr2); // [10, bc, cd]
//
//        // clear()
//        arr1.clear();
//        System.out.println(arr1); // []

    }


}
