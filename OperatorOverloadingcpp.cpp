/*********************CHANDRAKESH RAM***************************/
/*=======================PROBLEM STATEMENT==============*/
#include <bits/stdc++.h>
using namespace std;
class Complex{
    
    int real,img;
    public :
    Complex(int r=0,int i=0){
        real=r;
        img=i; 
    }
    Complex operator + (Complex const &obj){
        Complex res;
        res.img=img + obj.img;
        res.real=real+ obj.real;
        return res;
    }
    void display(){
        cout<<real<<" + "<<img<<"i"<<endl;
    }

    
};
int main()
{
    Complex c1(12,7);
    Complex c2(23,32);
    Complex c3;
    c3=c1+c2;
    c3.display();
    return 0;
}
/*===========================OUTPUT=====================*/