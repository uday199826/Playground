#include<iostream>
#include<math.h>
int main()
{
    int a,n,i;
    a=11;
    std::cin>>n;
    std::cout<<pow(a,2)<<" ";
    
    for(i=1;i<n;i++)
    {
        a=a+4;
        std::cout<<pow(a,2)<<" ";
       
    }
}
