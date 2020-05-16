#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int x1,y1,x2,y2,x3,y3;
  cin>>x1>>y1>>x2>>y2>>x3>>y3;
  cout<<(float)(x1+x2+x3)/3<<"\n";
  cout<<(float)(y1+y2+y3)/3;
}