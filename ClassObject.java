/*=========================PROBLEM STATEMENT===========================
Write a program for class and object with data members and member functions
========================================================================
*/ 
class Student{      //Here class has been created of name Student 
    int roll_no;  // roll_no , name and marks are the data members of class Student
    String name;  //display() is the data function of class student
    int marks;
    Student(int roll, String name,int marks){  //Here we have created a Constructor
        this.roll_no=roll;    //we have initialized the value of data members
        this.name=name;
        this.marks=marks;


    }
    void display(){       //display function is used to display all the details of student
        System.out.println("Roll no : "+roll_no);
        System.out.println("Name :"+name);
        System.out.println("Marks :"+marks);
    }
}
public class ClassObject{
    public static void main(String []args ){
        Student s1=new Student(25058,"Chandrakesh",78);//here we have created an object with help of class Student
        s1.display();       //here we have accessed the data function of the class Student with help of object
    }
}
/*===================OUTPUT====================
Roll no : 25058
Name :Chandrakesh
Marks :78
===============================================
*/
