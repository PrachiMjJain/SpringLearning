package Java.ExceptionHandling;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static <BufferReader> void main(String[] args) throws Exception{
        int n=0;
        System.out.println("Enter a number : ");
       // BufferedReader br = null;
       /* try{
            br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine ());
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            br.close();
        }

        */

        // try wth resource
        try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){

            n = Integer.parseInt(br.readLine ());
        }
        System.out.println(n);
       
    }
}