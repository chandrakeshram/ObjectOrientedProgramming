interface Fruits{
    
    void taste();
    void smell();
    void significance();
}
class Apple{
    String name;
    String region;
    String leadingProducer;
}
class KashmiriApple extends Apple implements Fruits{
    KashmiriApple(String nm,String reg, String lprod){
        this.name=nm;
        this.region=reg;
        this.leadingProducer=lprod;
    }
    public void taste(){
        System.out.println("Taste of Kashmiri Apples is very great ");
    }
    public void smell(){
        System.out.println("Kashmiri Apple smells very good because they are grown naturally");
    }
    public void significance(){
        System.out.println("These apples are exported to the world and are major part of economy of Kashmir");
    }
    void display(){
        System.out.println("Name of the Fruit :"+this.name);
        System.out.println("Region of Cultivation :"+this.region);
        System.out.println("Leading Producer Of the Fruit :"+this.leadingProducer);
    }
}
public class InheritanceMultiple{
    public static void main(String []args){
        KashmiriApple k =new KashmiriApple("KashmiriApple", "Kashmir_India", "India");
        k.display();
        k.taste();
        k.smell();
        k.significance();

        
    }

}