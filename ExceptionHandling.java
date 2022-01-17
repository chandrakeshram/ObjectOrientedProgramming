import java.util.Scanner;

import javax.imageio.ImageTranscoder;
public class ExceptionHandling{
    public static void main(String[]args){
  
        Scanner cs =new Scanner(System.in);
       

        try{
            int a=10,b=0;
            int result=a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide any number by 0 "+e);

        }
        try{
            int b=Integer.parseInt("King");
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormat  exception is handled "+e);
        }
        try{
            int arr[]=new int[5];
            System.out.println(arr[7]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Cannot access out of bound index "+e);

        }

        

    }
}