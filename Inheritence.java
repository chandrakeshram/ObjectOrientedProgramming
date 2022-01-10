//This is single level Inheritance 
// We have not defined any data members for Bike class still it had data members and member function
//because of Inheritance . This example of Inheritance is single because only 1 base class
//is there and only 1 child class is there
class Vehicle{
    String name;
    int price;
    int speed;
    
    void averageCalculator(int petrol_quantity, int distance){
        int average = distance / petrol_quantity;
        System.out.println("Average will be "+average+" kilometres per litre");
    }
    void displayInfo(){
        System.out.println("Name of the Vehicle : "+this.name);
        System.out.println("Price of the Vehicle : "+this.price+" Rs");
        System.out.println("Speed of the Vehicle : "+this.speed+" km/hr");
    }
}
class Bike extends Vehicle{

    Bike(String nm, int pr,int sp){
        this.name=nm;
        this.price=pr;
        this.speed=sp;
    }

}
public class Inheritence {
    public static void main(String []args){
        Bike bullet =new Bike("Royal Enfield ",250000,180);
        bullet.displayInfo();
        bullet.averageCalculator(5, 100);
    }
    
}
