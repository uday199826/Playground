#include<iostream>
using namespace std;
int gcd(int n1,int n2)
{
    int gcd=0;
    for(int i=1;i<=n1 && i<=n2;i++){
        if(n1%i == 0 && n2%i == 0)
        {
            gcd=i;
        }
    }
    return gcd;
}
int main()
{
    int n1,n2;
    cin>>n1>>n2;
    int d=gcd(n1,n2);
    cout<<"G.C.D of "<<n1<<" and "<<n2<<" = "<<d;
}