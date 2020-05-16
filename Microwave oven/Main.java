#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int in;
  float ht;
  cin>>in;
  cin>>ht;
  if(in<=3)
  {
    if(in==1){cout<<setprecision(4)<<1*ht;}
    else if(in == 2)
    {
      
      cout<<setprecision(4)<<1.5*ht;
    }
    else if(in==3)
    {
      
      cout<<setprecision(4)<<2*ht;
    }
  }
  else{cout<<"Number of items is more";}
}