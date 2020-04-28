#include<iostream>
using namespace std;
int main()
{
    int n,i,j;
    cin>>n;
    cout<<n<<endl;
    for(i=1;i<4;i++)
    {
        for(j=1;j<=i+1;j++)
        {
            cout<<n+i;
        }
        cout<<"\n";
    }
    int k=n+3;
    for(i=3;i>=0;i--)
    {
        for(j=0;j<=i;j++)
        {
            cout<<i+n;
        }
        cout<<"\n";
    }
}