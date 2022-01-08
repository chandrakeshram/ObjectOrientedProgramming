class Bank{
    float getRateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{
    @Override
    float getRateOfInterest(){
        return 8;
    }
}
class HDFC extends Bank{
    @Override
    float getRateOfInterest(){
        return 7;
    }
}
class ICICI extends Bank{
    @Override
    float getRateOfInterest(){
        return 9;
    }
}
public class RuntimePolymorphism{
    public static void main(String []args){
        Bank b=new Bank();
        SBI s=new SBI();
        ICICI i =new ICICI();
        HDFC h=new HDFC();
        System.out.println("Rate of Bank "+b.getRateOfInterest());   //method is not overriden for now
        System.out.println("Rate of Interest of SBI : "+s.getRateOfInterest());  //method is overriden
        System.out.println("Rate of Interest of ICICI : "+i.getRateOfInterest());//method is overriden
        System.out.println("Rate of Interest of HDFC : "+h.getRateOfInterest()); //method is overriden

    }
}