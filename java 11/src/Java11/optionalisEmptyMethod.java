package Java11;

import java.util.Optional;

public class optionalisEmptyMethod {
    public static void main(String[] arg){
        Optional o = Optional.of(" ");
        o=o.empty();
        System.out.println(o.isEmpty());
    }
}
