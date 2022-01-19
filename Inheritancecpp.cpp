/*********************CHANDRAKESH RAM***************************/
/*=======================PROBLEM STATEMENT==============*/
#include <bits/stdc++.h>
using namespace std;
class Animal{
    public :
    string name;
    int lifeSpan;
    void eat(){
        cout<<"Animal Eats"<<endl;
    }

};
class LivingOrganisms{
    public:
    void breathe(){
        cout<<"Living organisms can breathe "<<endl;
    }
};
class DomesticAnimal:public Animal{
    public :
    void food(){
        cout<<"Eats only grass"<<endl;
    }

};
class WildAnimal :public  Animal{   //here inheritance is implemented using ':'
                                    //public keyword assigns all the data members
                                    //and member functions as public in class 
                                    //wild animal 
    public :
    void hunt(){
        cout<<"Hunts and eats flesh only"<<endl;
    }
};
class Lion :public WildAnimal{

};
class Herbivores : public Animal ,public  LivingOrganisms{

};
int main()
{
    WildAnimal a;
    a.eat();
    a.name="WildAnimal";
    a.lifeSpan=100;
    cout<<a.name<<endl;
    cout<<a.lifeSpan<<endl;
    Lion l;
    l.name="Lion";
    l.lifeSpan=134;
    l.eat();
    l.hunt();
    cout<<l.name<<endl;
    cout<<l.lifeSpan<<endl;
    DomesticAnimal d;
    d.eat();
    d.food();
    d.name="Cow";
    d.lifeSpan=122;
    cout<<d.name<<endl;
    cout<<d.lifeSpan<<endl;
    Herbivores h;
    
    h.name="Goat";
    h.lifeSpan=20;
    h.eat();
    cout<<h.name<<endl;
    cout<<h.lifeSpan<<endl;
    h.breathe();

    return 0;
}
/*===========================OUTPUT=====================*/