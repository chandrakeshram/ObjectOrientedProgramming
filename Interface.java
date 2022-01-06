/*  =========PROBLEM STATEMENT========== Roll no :25058
Design and develop a context for given case study and implement an interface for Vehicles
Consider the example of vehicles like bicycle, car and bike. All Vehicles have common
functionalities such as Gear Change, Speed up and apply breaks. Make an interface and put all
these common functionalities. Bicycle, Bike, Car classes should be implemented for all these
functionalities in their own class in their own way.*/ 
import java.util.Scanner;
interface Vehicles{
    public void gearChanged();
    public void speedUp();
    public void applyBreaks();

}
class Bicycle implements Vehicles{
    public void gearChanged(){
        System.out.println("Gear Changed for the Bicycle. ");

    }
    public void speedUp(){
        System.out.println("Speed Up for the Bicycle. ");

    }
    public void applyBreaks(){
        System.out.println("Applied Breaks for the Bicycle. ");
    }

}
class Bike implements Vehicles{
    public void gearChanged(){
        System.out.println("Gear Changed for the Bike. ");

    }
    public void speedUp(){
        System.out.println("Speed Up for the Bike. ");

    }
    public void applyBreaks(){
        System.out.println("Applied Breaks for the Bike. ");
    }

}
class Car  implements Vehicles{
    public void gearChanged(){
        System.out.println("Gear Changed for the Car. ");

    }
    public void speedUp(){
        System.out.println("Speed Up for the Car. ");

    }
    public void applyBreaks(){
        System.out.println("Applied Breaks for the Car. ");
    }

}
public class Interface {
    public static void main(String[] args){
        Vehicles v;
        v= new Bicycle();
        v.gearChanged();
        v.speedUp();
        v.applyBreaks();

        v= new Bike();
        v.gearChanged();
        v.speedUp();
        v.applyBreaks();

        v= new Car();
        v.gearChanged();
        v.speedUp();
        v.applyBreaks();


    }
}
/*
=========OUPUT========
Gear Changed for the Bicycle.
Speed Up for the Bicycle.
Applied Breaks for the Bicycle.
Gear Changed for the Bike.
Speed Up for the Bike.
Applied Breaks for the Bike.
Gear Changed for the Car.
Speed Up for the Car.
Applied Breaks for the Car.
*/ 