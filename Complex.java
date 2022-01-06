
/*          *********PROBLEM STATEMENT***********                             Name:CHANDRAKESH RAM
Design a class 'Complex' with data members for real and 
imaginary part.Provide default and parameterized constructor 
Write a program to perform arithmetic operations of two 
complex numbers.*/
public class Complex{ // class Complex has been created.
    float real;       //Data members real and imaginary are also created.
    float imaginary;
    Complex(){}       //Default Constructor(Do nothing Constructor)
    Complex(float r, float i ){//Parameterized Constructor with r and i 
        real=r;                //as arguments.
        imaginary=i;
    }
    Complex addition(Complex a){     //Addition has been created with argument Complex a.
        Complex temp = new Complex();

        temp.real = this.real + a.real;//Temp variable is created to store
                                       //the addition of real part.
        temp.imaginary = this.imaginary + a.imaginary;//Temp variable is created to store
                                                      //the addition of imaginary part.

        return temp; //Here temp is returned.
    }
    //Similarly we can implement for all the arithmetic operations.
    Complex subtraction(Complex a){
        Complex temp = new Complex();
        temp.real = this.real - a.real;
        temp.imaginary = this.imaginary - a.imaginary;
        return temp; 
    }
    Complex multiplication(Complex a){
        Complex temp = new Complex();
        temp.real = this.real * a.real;
        temp.imaginary = this.imaginary * a.imaginary;
        return temp; 
    }
    Complex division(Complex a){
        Complex temp = new Complex();
        temp.real = this.real / a.real;
        temp.imaginary = this.imaginary / a.imaginary;
        return temp; 
    }
    public static void main(String[] args){
        Complex number1 = new Complex(3.5f,8.9f);//Here we assigned the value for 
        Complex number2 = new Complex(3.9f,8.4f);//Parameterized constructor.
        Complex result1;//Here result1 stores addition of two complex numbers.
        Complex result2;//Here result1 stores subtraction of two complex numbers.
        Complex result3;//Here result1 stores multiplication of two complex numbers.
        Complex result4;//Here result1 stores division of two complex numbers.
        result1 = number1.addition(number2);
        result2 = number1.subtraction(number2);
        result3 = number1.multiplication(number2);
        result4 = number1.division(number2); 
        System.out.println("===Complex Numbers Arithmetic Operations===");
        System.out.println();
        System.out.println("==== Addition       :"+ result1.real +" + "+ result1.imaginary+"i");
        System.out.println("==== Subtraction    :"+ result2.real +" + "+ result2.imaginary+"i");
        System.out.println("==== Multiplication :"+ result3.real +" + "+ result3.imaginary+"i");
        System.out.println("==== Division       :"+ result4.real +" + "+ result4.imaginary+"i");


        
    }
}
/*        OUTPUT of The Program

===Complex Numbers Arithmetic Operations===

==== Addition       :7.4 + 17.3i
==== Subtraction    :-0.4000001 + 0.5i
==== Multiplication :13.650001 + 74.759995i
==== Division       :0.8974359 + 1.0595238i 
*/