#include <iostream>

using namespace std;

int main()
{
    int a;
    float t;
    cin>>a>>t;
    if(a>13)
    {
        if(t<12.00)
        cout<<"$8.00";
        else if(t>12.00 && t<16.00)
        cout<<"$5.00";
    }
  else
  {
    if(t<12.00)
      cout<<"$4.00";
    else
      cout<<"$2.00";
  }
}
    