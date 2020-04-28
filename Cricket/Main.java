#include<bits/stdc++.h> 
#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int balls,runs,runs_s,balls_b;
  cin>>balls>>runs>>runs_s>>balls_b;
  cout<<balls/6<<endl;
  float b=(abs(balls_b/6)+(float(balls_b%6)/float(10)));
  cout<<b<<endl;
  float rr=float(runs_s)/b;
  rr=round(rr*10)/10;
  cout<<rr<<endl;
  float crr=float(runs)/(float(balls)/6);
  crr=round(crr*10)/10;
  cout<<crr;
  if(crr<rr)
    cout<<"\nEligible to Win";
  else
    cout<<"\nNot Eligible to Win";
}