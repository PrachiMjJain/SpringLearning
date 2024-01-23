import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args){
       /* List<Integer> values = new ArrayList<Integer>();
        for(int i=1; i<=100; i++){
            values.add(i);
        }
        */

        /* 1 way
        for(int i : values){
            System.out.println(i);
        }

         */
        /* 2 way
            values.forEach(System.out::println);
         */
        /* 3 way through stream
             values.parallelStream().forEach(System.out::println);
        */

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        // filter function
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());



    }
}
