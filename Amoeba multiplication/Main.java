#include<iostream>
using namespace std;
void fib(int n)
{
    int f1=0,f2=1,f3=1,i;
    //cout<<f1<<" "<<f2<<" "<<f3<<" ";
    for(i=1;i<=n-3;i++)
    {
        
        f1=f2;
        f2=f3;
        f3=f1+f2;
        
    }
    cout<<f3<<" ";
}
int main()
{
    int n;
    cin>>n;
    fib(n);
}