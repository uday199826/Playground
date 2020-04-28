#include<iostream>
using namespace std;
int main()
{
  int n,i,k,temp=0;
  cin>>n;
  cin>>k;
  for(i=1;i<k+n;i++)
  {
    if((k+n)%i==0)
      temp=temp+i;
  }
  //cout<<temp;
  if(temp==(k+n))
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}