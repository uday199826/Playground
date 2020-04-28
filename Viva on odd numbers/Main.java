#include<iostream>
using namespace std;
int main()
{
    int n,p=0,k=0;
    float count=0;
    cin>>n;
    if(n%2!=0)
    {
        count=count+1;
        p=p+1;
        
    }
        
    else if(n%2==0)
    {
        count=count-0.5;
        
    }
    while(n>0 && k!=1 && p!=3)
    {
        cin>>n;
        if(n%2!=0 && n>0)
        {
            p=p+1;
            count=count+1;
        }
        else if(n%2==0 && n>0)
            count=count-0.5;
        else if(n<0)
        {
            k=1;
            count=count-1;
            break;
        }
    }
    
    cout<<count;
}