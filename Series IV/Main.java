#include<iostream>
#include<math.h>
int main()
{
    int n,i,a,b;
    a=1;
    std::cin>>n;
   
    a=pow(a,1);
    std::cout<<a-1;
     std::cout<<" ";
    for(i=1;i<n;i++)
    {
        a=a+1;
     // std::cout<<" ";
        b=pow(a,2);
        if(b % 2 == 0)
        {
            std::cout<<b-2;
        }
        else
        std::cout<<b-1;
        std::cout<<" ";
      
    }

}
