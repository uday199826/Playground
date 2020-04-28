#include<iostream>
using namespace std;
int main()
{
    int n,i,j,c=0;
    cin>>n;
    cout<<1<<endl;
    for(i=2;i<=n;i++)
    {
        c=0;
        for(j=1;j<=i;j++)
        {
            c=c+1;
            cout<<i;
            if(c!=i)
            {
                cout<<"*";
            }
        }
        cout<<"\n";
    }
    c=0;
    for(i=n;i>=2;i--)
    {
        c=0;
        for(j=1;j<=i;j++)
        {
            c=c+1;
            cout<<i;
            if(c!=i)
            {
                cout<<"*";
            }
        }
        cout<<"\n";
    }
    cout<<1;
}