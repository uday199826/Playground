#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,c1,d2,c2,d,c;
  cin>>d1>>c1>>d2>>c2;
  d=d1+d2;
  c=c1+c2;
  if(c>100)
  {
    d=d+1;
    c=c-100;
    cout<<d<<"\n"<<c;
  }
  else
  {
    cout<<d<<"\n"<<c;
  }
}