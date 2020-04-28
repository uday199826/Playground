#include<iostream>
using namespace std;
int power(int a,int n)
{
    int result=a;
    while(n-1!=0)
    {
        result=result*a;
        n=n-1;
    }
    return result;
}
int main()
{
    int a,n;
    cout<<"Enter the value of a"<<endl;
    cin>>a;
    cout<<"Enter the value of n"<<endl;
    cin>>n;
    int d=power(a,n);
    cout<<"The value of "<<a<<" power "<<n<<" is "<<d;
}