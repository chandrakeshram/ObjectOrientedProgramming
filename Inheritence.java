
class Vehicle{        //here we have created class Vehicle 
    String name;
    int price;
    int speed;
    
    void averageCalculator(int petrol_quantity, int distance){       //this is method of class Vehicle
        int average = distance / petrol_quantity;
        System.out.println("Average will be "+average+" kilometres per litre");
    }
    void displayInfo(){                                               //this is method of class Vehicle
        System.out.println("Name of the Vehicle : "+this.name);
        System.out.println("Price of the Vehicle : "+this.price+" Rs");
        System.out.println("Speed of the Vehicle : "+this.speed+" km/hr");
    }
}
class Bike extends Vehicle{            //here we have inherited the properties of one class from another class 

    Bike(String nm, int pr,int sp){
        this.name=nm;
        this.price=pr;
        this.speed=sp;
    }

}
public class Inheritence {
    public static void main(String []args){
        Bike bullet =new Bike("Royal Enfield ",250000,180);
        bullet.displayInfo();        //there is no function displayInfo() & averageCalulator() defined in class Bike but still it will display the information
                                     //this is because of inheritance 
                                     //inheritance here is single level inheritance 
                                     //there is only one base class (super) and sub class(child)
        bullet.averageCalculator(5, 100);
    }
    
}
