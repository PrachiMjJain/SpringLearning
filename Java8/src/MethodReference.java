import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface Parser{
    String parse(String str);
}

class StringParser{
    public static String convert(String str){
        if(str.length()<=3)
            str = str.toUpperCase();
        else
            str = str.toLowerCase();
        return str;

    }
}


class MyPrinter{
    public static  void print(String str, Parser p){
        str = p.parse(str);
        System.out.println(str);
    }
}



public class MethodReference {
    public static void main(String[] args) {

      /* 1 way
        List<String> values = Arrays.asList("Prachi","Arpit" , "Anu" , "sammy");
        values.forEach((s) -> System.out.println(s));

    }
    */


        String str = "Prachi Jain";
        MyPrinter np = new MyPrinter();
        np.print(str, (StringParser::convert));

          /* for integer
        StringParser sp = new StringParser();
        String str = "Prachi Jain";
        MyPrinter np = new MyPrinter();
        np.print(str , (sp::convert));

           */
    }

}
