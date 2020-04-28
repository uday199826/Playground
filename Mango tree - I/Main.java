#include<iostream>
using namespace std;
int main()
{
int r,c,t;
  cin>>r>>c>>t;
  if(t%5==1||t%5==0)
    cout<<"Yes";
  else if(t>1 && t<c)
    cout<<"Yes";
  else
    cout<<"No";
}