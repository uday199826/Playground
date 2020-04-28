#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a,i,n;
  a=11;
  cin>>n;
  cout<<pow(a,2)<<" ";
  for(i=1;i<n;i++)
  {
    a=a+4;
    cout<<pow(a,2)<<" ";
  }
}