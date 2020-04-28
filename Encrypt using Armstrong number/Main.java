#include<iostream>
#include<cmath>
using namespace std;

int arm(int);
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";    
}
int arm(int n)
{
  int sum=n;
  int d=0,rem,c;
  int temp=n;
  while(n!=0)
  {
    c=c+1;
    n=n/10;
  }
  //cout<<c;
  while(temp>0)
  {
    rem=temp%10;
    d=d+pow(rem,c);
    temp=temp/10;
  }
  if(d==sum)
    return 1;
  else
    return 0;
}