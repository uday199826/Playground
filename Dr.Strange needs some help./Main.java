#include<iostream>
#include<cmath>
using namespace std;
int bact(int,int);
int main()
{
  int a,b;
  cin>>a>>b;
  int k=bact(a,b);
  int d;
  cin>>d;
  if(d<=k)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}
int bact(int a,int b)
{
  int d=pow(a,b);
  return d;
}
    