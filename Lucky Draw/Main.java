#include<iostream>
using namespace std;
int main()
{
  int n,count=0;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    if(n%i==0)
      count=count+1;
  }
  if(count==2)
    cout<<"Eligible";
  else
    cout<<"Not eligible";
}