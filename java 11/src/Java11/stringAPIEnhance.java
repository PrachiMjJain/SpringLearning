package Java11;

import java.util.List;
import java.util.stream.Collectors;

public class stringAPIEnhance {
    public static void main(String[] args){

        String a = "   ";
        String b = " hello \n"
                + "welcome \n"
                + "bye";
        String c = " Prachi ";

        // isBlank()
        System.out.println("blank = " + a.isBlank());
        System.out.println("Empty = " + a.isEmpty());


        //lines()
        b.lines().forEach(System.out:: println);
        // in list for
        List<String> res= b.lines().collect(Collectors.toList());
        System.out.println("lines in list form = " + res);

        // strip()
        System.out.println("strip =" + c.strip());
        System.out.println("trim =" + c.trim());

        //stripLeading()
        System.out.println("stripLeading =" + c.stripLeading());

        // stripTrailing()
        System.out.println("stripTrailing =" + c.stripTrailing());

        //Repeat()
        System.out.println("Repeat =" + c.repeat(5));



    }
}

