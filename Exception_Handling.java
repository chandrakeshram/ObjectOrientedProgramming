/*                 Roll no 25058    
******************Problem Statement*******************
Implement a program to handle Arithmetic exception, Array Index Out of Bounds. The user enters
two numbers Num1 and Num2. The division of Num1 and Num2 is displayed. If Num1 and Num2
are not integers, the program would throw a Number Format Exception. If Num2 were zero, the
program would throw an Arithmetic Exception. Display the exception.
         */
import java.util.Scanner;


public class Exception_Handling{
    public static void main(String[] args){
        int num1,num2,result;
        try{
            Scanner cs =new Scanner(System.in);
            System.out.println("Enter the First Number :");
            num1=Integer.parseInt(cs.next());
            System.out.println("Enter the Second Number :");
            num2=Integer.parseInt(cs.next());
            result =num1/num2;
            System.out.println("Division: "+result);
           
        }
        catch(ArithmeticException e){
            System.out.println("Denominator cannot be ZERO!  "+e);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid Format of Input  "+e);
        }

    }
}
/**************OUTPUT OF THE PROGRAM************************
Enter the First Number :
12
Enter the Second Number :
0
Denominator cannot be ZERO!  java.lang.ArithmeticException: / by zero

Enter the First Number :
acvg
Invalid Format of Input  java.lang.NumberFormatException: For input string: "acvg"
*/