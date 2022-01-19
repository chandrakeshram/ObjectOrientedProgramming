/*********************CHANDRAKESH RAM***************************/
/*=======================PROBLEM STATEMENT==============*/
#include <bits/stdc++.h>
using namespace std;
class Student{
    public:
    string name;
    int age;
    int roll_no;
    Student(string nm,int roll,int ag){  //Parameterized Constructor
        name=nm;                         
        roll_no=roll;
        age=ag;
        cout<<"Parameterized Constructor"<<endl;
        
    }
    Student(){
        cout<<"Default Constructor"<<endl;
    }
    Student(Student &a){
        name=a.name;
        age=a.age;
        roll_no=a.roll_no;
        cout<<"Copy Constructor"<<endl;
    }
    ~Student(){
        cout<<"Destructor called"<<endl;
    }

};
int main()
{
    Student s("Chandrakesh",123,20);
    Student s1;
    Student s2=s;
    Student s3;

    
    return 0;
}
/*===========================OUTPUT=====================*/