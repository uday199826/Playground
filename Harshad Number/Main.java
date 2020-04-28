#include<iostream>
using namespace std;
int main()
{
  int n,sum,rem,temp;
  cin>>n;
  temp=n;
  while(n!=0)
  {
    rem=n%10;
    sum=sum+rem;
    n=n/10;
  }
  if(temp%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  
}