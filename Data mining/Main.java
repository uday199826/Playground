#include<iostream>
using namespace std;
int main()
{
    int n,rem,rev=0,count=0;
    int se=0,so=0,i;
    cin>>n;
    int temp=n;
    while(n!=0)
    {
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
        count=count+1;
    }
    //cout<<count<<rev;
    for(i=1;i<=count;i++)
    {
        if(i%2==0)
        {
            int r=rev%10;
            se=se+r;
            //cout<<"e"<<r<<endl;
            rev=rev/10;
        }
        else
        {
            int k=rev%10;
            so=so+k;
            //cout<<"o"<<k<<endl;
            rev=rev/10;
        }
    }
    //cout<<se<<"\n"<<so;
    if(se==so)
        cout<<"Yes";
    else
        cout<<"No";
}
