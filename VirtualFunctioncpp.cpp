/*********************CHANDRAKESH RAM***************************/
/*=======================PROBLEM STATEMENT==============*/
#include <bits/stdc++.h>
using namespace std;
class Base{
    public :
    virtual void print(){
        cout<<"This is the base's class print function"<<endl;
    }
    virtual void display(){
        cout<<"This is the base's class display function"<<endl;
    }
};
class SubClass :public  Base{
    public:
    void print(){
        cout<<"This is the subclass's  print  function"<<endl;
    }
    void display(){
        cout<<"This is the subclass's display function"<<endl;
    }
};
int main()
{
    Base *ptr;
    SubClass d;

    ptr=&d;
    ptr->display();
    ptr->print();

    return 0;
}
/*===========================OUTPUT=====================*/