#include<iostream>
using namespace std;
int digit(int n)
{
    int sum=0,rem=0;
    while(n!=0)
    {
        rem=n%10;
        sum=sum+rem;
        n=n/10;
    }
    //cout<<sum<<endl;
    if(sum<10)
    {
        return sum;
    }
    else
    {
        return digit(sum);
    }
}
int main()
{
    int n;
    cin>>n;
    int d=digit(n);
    cout<<d;
}