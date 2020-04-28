#include<iostream>
int main()
{
  int n,i,a=6,sum=5;
  std::cin>>n;
  for (i=1;i<=n;i++)
  {
  std::cout<<a;
  std::cout<<" ";
  a=a+sum;
    sum=sum+5;
    
  }
  return 0;
}