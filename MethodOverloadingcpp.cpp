/*********************CHANDRAKESH RAM***************************/
/*=======================PROBLEM STATEMENT==============*/
#include <bits/stdc++.h>
using namespace std;
class A{
    public:
    void display(){
        cout<<"I am a function with no arguments"<<endl;
    }
    void display(int a){  //method overloading
        cout<<"I am a function with int argument"<<endl;
    }
    void display(double a){  //method overloading
        cout<<"I am a function with double argument"<<endl;
    }
    void display(int a ,int b){   //method overloading
        cout<<"I am a function with two arguments "<<endl;
    }

};
int main()
{
    A obj;
    obj.display();
    obj.display(45);
    obj.display(52.89);
    obj.display(12,78);
    return 0;
}
/*===========================OUTPUT=====================*/