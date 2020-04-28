#include<iostream>
using namespace std;
int main()
{
  string entry;
  int num;
  cin>>entry>>num;
  if(entry=="front")
  {
    if(num==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else
  {
    if(num==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
  }
}