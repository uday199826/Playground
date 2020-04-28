#include<iostream>
using namespace std;
int main()
{
    int birth,year;
    cin>>birth>>year;
    if(birth>year)
    cout<<(2000+year)-(1900+birth);
  
    else 
    cout<<(2000+year)-(2000+birth);
    
}
    
 