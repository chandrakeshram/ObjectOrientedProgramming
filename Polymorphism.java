/*=====================PROBLEM STATEMENT=====================
Write a program to implement polymorphism i.e compile time 
polymorphism 
============================================================= */
class Student{
    int roll_no;
    String name;
    int marks;
    Student(int roll,String nm,int mark){
        this.roll_no=roll;
        this.name=nm;
        this.marks=mark;
    }
    void displayInfo(){
        System.out.println("Roll no of Student: "+this.roll_no);
        System.out.println("Name of the Student: "+this.name);
        System.out.println("Marks of the Student: "+this.marks);
    }
    void displayInfo(String stream){
        System.out.println("Stream of the Student: "+stream);
    }
}
public class Polymorphism{
    public static void main(String []args){
        Student s1=new Student(101,"Chandrakesh",79);
        Student s2=new Student(102,"Raj",78);
        s1.displayInfo();
        s1.displayInfo("Science");
        s2.displayInfo();
        s2.displayInfo("Commerce");
    }
}
/*====================OUTPUT=================
Roll no of Student: 101
Name of the Student: Chandrakesh
Marks of the Student: 79
Stream of the Student: Science
Roll no of Student: 102
Name of the Student: Raj
Marks of the Student: 78
Stream of the Student: Commerce
=============================================
*/ 