/*********************CHANDRAKESH RAM***************************/
/*=======================PROBLEM STATEMENT==============*/
#include <bits/stdc++.h>
using namespace std;
class Encapsulation{
    public :
    void A(){
        cout<<"Function A"<<endl;
    }
    private:
    void  B(){
        cout<<"Function B"<<endl;

    }
    protected:
    void C(){
        cout<<"Function C"<<endl;
    }
};
class Encap : Encapsulation{
    public :
    void C(){
        cout<<"Function C"<<endl;
    }

};
int main()
{
    Encapsulation obj;
    obj.A();
    Encap obj1;
    obj1.C();
    // obj.B();
    // obj.C();
    return 0;
}
/*===========================OUTPUT=====================*/