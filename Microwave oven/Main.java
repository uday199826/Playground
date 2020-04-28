#include <iostream>

using namespace std;

int main()
{
    int items;
    float time;
    cin>>items>>time;
    if(items==2)
    {
        float time1;
        time1=time+((time*50)/100);
        cout<<time1;
    }
    else if(items==3)
    {
    float time2;
    time2=(2*time)/1.0;
    cout<<time2;
    }
    else
    cout<<"Number of items is more";

}
