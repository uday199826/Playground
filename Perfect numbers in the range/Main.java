#include<iostream>
using namespace std;
int main()
{
  int s,l,i,temp=0,n;
  cin>>s>>l;
  for(n=s;n>=s&&n<=l;n++)
  {
    temp=0;
    for(i=1;i<n;i++)
    {
      if(n%i==0)
      {
        temp=temp+i;
      }
    }
    if(temp==n)
      cout<<n<<" ";
  }
}