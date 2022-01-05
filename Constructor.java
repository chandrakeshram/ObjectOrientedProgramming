/*============================CONSTRUCTOR======================
Write a program for default and parameterized constructor
===============================================================
 */
class Fruits{
    String color;
    String shape;
    String name;

    Fruits(){
        System.out.println("This is a default constructor");
        System.out.println("Welcome to the world of Fruits");

    }
    Fruits(String col, String shp,String nm){
        this.color=col;
        this.shape=shp;
        this.name=nm;
    }
    void display(){
        System.out.println("This is a Parameterized Constructor");
        System.out.println("Color of the fruit :"+this.color);
        System.out.println("Shape of the fruit :"+this.shape);
    }
    void display(String area_cult){
        System.out.println("Name of the Fruit: "+this.name);
        System.out.println("Area of Cultivation: "+area_cult);
    }
}
public class Constructor{
    public static void main(String args[]){
        Fruits f=new Fruits();
        Fruits apple=new Fruits("Red","Round ","Apple");
        Fruits mango=new Fruits("Yellow","Round","Mango");
        apple.display();
        mango.display();
        apple.display("Kashmir");
        mango.display("Maharashtra");
    }
}
/*==================OUTPUT============================
This is a default constructor
Welcome to the world of Fruits
This is a Parameterized Constructor
Color of the fruit :Red
Shape of the fruit :Round
This is a Parameterized Constructor
Color of the fruit :Yellow
Shape of the fruit :Round
Name of the Fruit: Apple
Area of Cultivation: Kashmir
Name of the Fruit: Mango
Area of Cultivation: Maharashtra
=====================================================
 */