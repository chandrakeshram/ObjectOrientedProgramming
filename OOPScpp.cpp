/*********************CHANDRAKESH RAM***************************/
/*=======================PROBLEM STATEMENT==============*/
#include <bits/stdc++.h>
using namespace std;
class Student{
    string id;
    int pass;
    public:
    int roll_no;
    string name;
    int age;
    void setId(string s){   //setter is used in order to access the private data members 
        id =s;
    }
    void setPass(int p){
        pass=p;
    }
    void getId(){
        cout<<id<<endl;
    }
    void display(){
        
        cout<<"Name of the student: "<<name<<endl;
        cout<<"Roll no of the student: "<<roll_no<<endl;
        cout<<"Age of the student :"<<age<<endl;
        cout<<"Password of the student :"<<pass<<endl;
        cout<<"ID of the student :"<<id<<endl;
        

        
    }

};
int main()
{
    Student arr[3];
    for(int i=0;i<3;i++){
        cout<<"Enter the name of Student: "<<endl;
        cin>>arr[i].name;
        cout<<"Enter the roll no of Student: "<<endl;
        cin>>arr[i].roll_no;
        cout<<"Enter the age of the Student: "<<endl;
        cin>>arr[i].age;
        cout<<"Enter the id of the student: "<<endl;
        string s;
        cin>>s;
        arr[i].setId(s);
        cout<<"Enter the Password of the student: "<<endl;
        int p;
        cin>>p;
        arr[i].setPass(p);
    }
    for(int i=0;i<3;i++){
        arr[i].display();
    }
    

    return 0;
}
/*===========================OUTPUT=====================*/