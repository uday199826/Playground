#include<iostream>
using namespace std;
int main()
{
    int n,i,j,count=0,k=1,t=1,p=1,w;
    cin>>n;
    cout<<1<<endl;
    for(i=2;i<=n;i++)
    
    {
        count=0;
        if(i%2!=0)
        {
            for(j=1;j<=i;j++)
            {
                t=k;
                count=count+1;
                int t=k+j;
                p=t;
                cout<<t;
                if(count!=i)
                {
                cout<<"*";
                }
            }
            //cout<<"p is"<<p<<endl;
        }
        else
        {
            for(j=i;j>0;j--)
            {
                k=p;
                count=count+1;
                k=k+j;
                w=k;
                cout<<k;
                if(count!=i)
                {
                    cout<<"*";
                }
            }
            
            k=p+i;
            //cout<<"k is"<<k;
        }
        cout<<"\n";
    }
}