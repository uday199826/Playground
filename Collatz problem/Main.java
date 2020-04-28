#include<iostream>
using namespace std;
void collatz(int n)
    {
        int k=n,count=0;
  		cout<<k<<endl;
        while(n!=1)
        {
            if(n%2==0)
            {
                 n=n/2;
                 cout<<n<<endl;
              	 count=count+1;
            }
            else
            {
                n=(3*n)+1;
                cout<<n<<endl;
              	count=count+1;
            }
        }   
        cout<<count<<endl;    
    }
int main()
{
    int n,k;
    cin>>n;
    collatz(n);
}