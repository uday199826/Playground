#include<iostream>
using namespace std;
int fac(int n)
{
    int fact=1;
    if(n==1 || n==0)
    {
        return 1;
    }
    else
    {
        return n*fac(n-1);
    }
}
int main()
{
    int n;
    cin>>n;
    int d=fac(n);
    cout<<"The factorial of "<<n<<" is "<<d;
}