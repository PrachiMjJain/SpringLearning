package CollectionAndGeneries;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapInterface8 {
    public static void main(String[] args){
        //Map<String , String> map = new HashMap<>(); // HashMap is not synchronized

        Map<String , String> map = new Hashtable<>(); // HashTable is synchronized

        map.put("my name","Prachi");
        map.put("My brother name","Arpit");
        map.put("CEO","Marisa");
        map.put("CEO","Jain"); // it will override older one

        //System.out.println(map);

        Set<String> keys = map.keySet();

        for(String key : keys) {
            System.out.println(key + " = " +map.get(key));
        }




    }
}
