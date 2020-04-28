#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  cin>>a>>b>>c;
  int max,code,i;
  if(a>b && a>c)
    max=a;
  else if(b>a && b>c)
    max=b;
  else
    max=c;
  code=0;
  for(i=1;i<max;i++)
  {
    if(a%i==0 && b%i==0 && c%i==0)
    {
      if(i>code)
        code=i;
    }
  }
  if(a >= b && a >= c)
    {
        if(b >= c)
        {
            cout<<"The treasure is in box which has number "<<b<<endl;
        }
        else
        {
			cout<<"The treasure is in box which has number "<<c<<endl;        }
    }
    else if(b >= a && b >= c)
    {
        if(a >= c)
        {
            cout<<"The treasure is in box which has number "<<a<<endl;
        }
        else
        {
            cout<<"The treasure is in box which has number "<<c<<endl;
        }
    }
    else if(a >= b)
    {
        cout<<"The treasure is in box which has number "<<a<<endl;
    }
    else
    {
        cout<<"The treasure is in box which has number "<<b<<endl;
    }
    
    cout<<"The code to open the box is "<<code;
    
}