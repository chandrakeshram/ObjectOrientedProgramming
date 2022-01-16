class Book{          //here we have created class Book 
    int price;
    String name;
    String author;
    void display(){     //this is void method called display()
        System.out.println("Name of Book : "+this.name);
        System.out.println("Author of Book : "+this.author);
        System.out.println("Price of Book : "+this.price);
    }
}
class Comics extends Book{    //here class Comics inherits class Book 
    void purpose(String s){
        System.out.println("Purpose of the Comics is make  :"+s);
    }
}
class Tom_Jerry extends Comics{    //here class Tom_Jerry inherits class Comics 
                                   //so class Book is inherited by class Tom_Jerry indirectly
                                   //this is example of multilevel inheritance 
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



//NOTE:
/*                           BOOK
                               |
                            COMIC_BOOK
                               |
                            TOM_JERRY
                   
*/
