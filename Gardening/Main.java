#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  cin>>x>>y>>z;
  if((z>=(x*(x-2)+1) && (z<=(x*(x-1)))) || ((z>=(x+1)) && (z<=2*x)))
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
}