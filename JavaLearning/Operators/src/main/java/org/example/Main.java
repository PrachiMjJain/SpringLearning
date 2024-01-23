package org.example;

public class Main {
    public static void main(String[] args) {
        // UASRBLTA

        // unary operator : expr++ ,expr-- , ++expr, --expr ,+expr, -expr ,~ ,!
        System.out.println("unary operator!");
        int a = 2;
        int b = 3+a;
        System.out.println(a++); // 2 (3)
        System.out.println(++b); // 6 (7)
        System.out.println(--a); // 3
        System.out.println(b--); // 6


        // arthemetic operator : * , / , % , + , -
        // Note  : % can work also with float and double
        System.out.println("arthemetic operator!");
        System.out.println(b); // 5
        System.out.println(b-3); //2
        System.out.println(b*4); // 20
        System.out.println(b%7); // 2
        System.out.println(b /7); // 1


        // shift operator : << >> >>>
        System.out.println("shift operator!");
        System.out.println(10 << 5); // 10*2^5 = 10*32 = 320
        System.out.println(10>> 4); // 10/2^2 = 10/4 = 2.5

        // Relational operator : < , > , <= , >= ,instanceof , ==  ,!=
        System.out.println("relational operator!");
        System.out.println(10<2); //false
        System.out.println(10>4); // true
        System.out.println(10<=9); // false
        System.out.println(130>=293); // false
        System.out.println();
        System.out.println(20 == 21); // false
        System.out.println(20!=21); // true

        // bitwaise operator : & , ^ , |
        System.out.println("bitwisw operator!");
        System.out.println(2 & 3); //
        System.out.println( 2 | 3);

        // Logical operator : && , ||
        System.out.println("logical operator!");
        System.out.println(32> 33 && 36 <97); // false
        System.out.println(78 <=3 || 93 >=34); // false

        // ternary or conditional operator : ? :
        System.out.println("ternary operator!");
        System.out.println(73>3 ? "yes" : "no");

        //assignment operator : 	= , += , -= , *= , /=  ,%=  ,&=  ,^= ,|= , <<= , >>= , >>>=
        System.out.println();

        //


    }
}