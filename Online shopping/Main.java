#include<iostream>
using namespace std;
int main()
{
    int p1,d1,s1,p2,d2,s2,p3,d3,s3,f,s,a;
    cin>>p1>>d1>>s1>>p2>>d2>>s2>>p3>>d3>>s3;
    
    f=(p1-(p1 * d1 / 100))+s1;
    s=(p2-(p2 * d2 / 100))+s2;
    a=(p3-(p3 * d3 / 100))+s3;
    cout<<"In Flipkart Rs."<<f<<"\n";
    cout<<"In Snapdeal Rs."<<s<<"\n";
    cout<<"In Amazon Rs."<<a<<"\n";
    if(f<s&&f<a)
    {
        cout<<"He will prefer Flipkart";
    }
    else if(s<f&&s<a)
        cout<<"He will prefer Snapdeal";
        else if(a<f&&a<s)
        cout<<"He will prefer Amazon";
        else if(f==s)
        cout<<"He will prefer Flipkart";
}
    
    
    