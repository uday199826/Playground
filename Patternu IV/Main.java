#include<iostream>
using namespace std;
int main()
{
    int n,i,j;
    cin>>n;
    for(i=1;i<=n;i++)
    {
        if(i%2!=0)
        {
            
            for(j=1;j<n;j++)
            {
                cout<<i;
            }
            cout<<i+1;
            cout<<"\n";
        }
        
        else
        {
            //cout<<"\n";
            cout<<i+1;
            for(j=1;j<n;j++)
            {
                cout<<i;
            }
            cout<<"\n";
        }
        
    }
}