interface A{
    void show();
}
// 1 way through class implementation
 /*
 class Xyz implements A{

    public void show(){
        System.out.println("Hello class implementation");
    }
}

  */


public class LambdaExpression {
    public static void main(String[] args){
        A obj;
        // 1 way through class object
        /*
         obj = new Xyz();
         obj.show();

         */

        // 2 way through anonymous function
        /*
        obj = new  A(){
            public void show(){
                System.out.println("Hello anonymous function");
            }
        };
        obj.show();
        */

        // 3 way through lambda function
        obj = () -> System.out.println("hello lambda function");
        obj.show();
    }
}
