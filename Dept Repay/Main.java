#include<iostream>
using namespace std;
int main()
{
  int p,r,t;
  cin>>p;
  cin>>r;
  cin>>t;
  float intr = (p*r*t)/100;
  cout.precision(5);
  cout<<intr<<"\n";
  cout<<p+intr<<"\n";
  cout<<0.02*intr<<"\n";
  cout<<p+(0.98*intr);
}