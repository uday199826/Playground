#include<iostream>
using namespace std;
int main()
{
    int max,n,c=0,sum=0;
    cin>>max;
    cin>>n;
    sum=sum+n;
    c=c+1;
    while(sum<max)
    {

        cin>>n;
        sum=sum+n;
        c=c+1;
    }
    cout<<"The number of turns is "<<c;
}
