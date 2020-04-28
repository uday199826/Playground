#include<iostream>
using namespace std;
int fib(int n)
{
    int f1=0,f2=1,f3=0;
    f3=f1+f2;
    //cout<<f1<<f2<<f3;
    for(int i=0;i<n-3;i++)
    {
        f1=f2;
        f2=f3;
        f3=f1+f2;
        //cout<<f3;
    }
   return f3; 
}
int main()
{
    int n;
    cin>>n;
    int d=fib(n);
    cout<<"The term "<<n<<" in the fibonacci series is "<<d;
}