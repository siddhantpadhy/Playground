#include<iostream>
using namespace std;
int main()
{
  int by,cy;
  cin>>by;
  cin>>cy;
  if(cy<by){cy=cy+100;}
  cout<<(cy-by);
}