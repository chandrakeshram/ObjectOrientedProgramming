class Book{
    int price;
    String name;
    String author;
    void display(){
        System.out.println("Name of Book : "+this.name);
        System.out.println("Author of Book : "+this.author);
        System.out.println("Price of Book : "+this.price);
    }
}
class Comics extends Book{
    void purpose(String s){
        System.out.println("Purpose of the Comics is make  :"+s);
    }
}
class Tom_Jerry extends Comics{

}
public class InheritanceMultilevel{
    public static void main(String []args){
        Tom_Jerry b1 = new Tom_Jerry();
        b1.name="Tom & Jerry";
        b1.author="Larry Page";
        b1.price=150;
        b1.display();
        b1.purpose("Laugh");
    }
}