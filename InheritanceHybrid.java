

class Animal {
    String name;
    void walk(){
        System.out.println("Animals can walk ");
    }
    void eat (){
        System.out.println("Animals can eat ");;
    }


}
class Dog extends Animal {
    void bark(){
        System.out.println("Dogs can bark");
    }


}
interface TrainedDog{
    
    void training();
        
    void speed();
        
}
class GermanShepherd extends Dog implements TrainedDog{
    public void training(){
        System.out.println("German Shepherd dog is given training to help military");
    }
    public void speed(){
        System.out.println("German Shepherd dogs are very fast");
    }
}
public class InheritanceHybrid{
    public static void  main(String []args){
        GermanShepherd s = new GermanShepherd();
        s.name="GermanShepherd";
        System.out.println("Name of the Dog :"+s.name);
        s.eat();
        s.bark();
        s.speed();
        s.training();
        s.walk();
    }
}