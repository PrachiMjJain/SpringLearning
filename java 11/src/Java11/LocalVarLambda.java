package Java11;

public class LocalVarLambda {
    public static void main(String[] args){
        var x = 123;
        var y= 456;
        // interface with lambda , var with java 11
        FuncInter funcObj = (var a, var b) -> a+b;
       // int result = funcObj.operation(x,y);
        System.out.println(funcObj.operation(x,y));
    }
}

interface FuncInter{
    int operation(int a , int b);


}
