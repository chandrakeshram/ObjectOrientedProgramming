class Animal{
    void walk(){
        System.out.println("Animal is walking");
    }
    void eat(){
        System.out.println("Animal is eating ");
    }
}
class Tiger extends Animal{
    void walk(){
        System.out.println("Tiger is walking");
    }
    
}
class Lion extends Animal{
    
    void eat(){
        System.out.println("Lion is eating");
    }
}
public class InheritanceHeirarchial {
    public static void main(String[]args){
        Lion l=new Lion();
        Tiger t=new Tiger();
        l.walk();
        l.eat();
        t.walk();
        t.eat();
    }
}
