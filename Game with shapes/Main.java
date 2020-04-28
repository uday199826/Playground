#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int side,radious;
  cin>>radious>>side;
  if((2*radious)<=side)
  {
      cout<<"circle can be inside a square";
  }
  else 
  {
      cout <<"circle cannot be inside a square";
  }
}