#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fs,f,sa,sd,ss,s,aa,ad,as,a;
  cin>>fa;
  cin>>fd;
  cin>>fs;
  cin>>sa;
  cin>>sd;
  cin>>ss;
  cin>>aa;
  cin>>ad;
  cin>>as;
  f=(fa-((fd*fa)/100))+fs;
  s=(sa-((sd*sa)/100))+ss;
  a=(aa-((ad*aa)/100))+as;
  cout<<"In Flipkart Rs."<<f<<"\n";
  cout<<"In Snapdeal Rs."<<s<<"\n";
  cout<<"In Amazon Rs."<<a<<"\n";
  if(f<=a && f<=s){cout<<"He will prefer Flipkart";}
  else if(a<=f && a<=s){cout<<"He will prefer Amazon";}
  else{cout<<"He will prefer Snapdeal";}
}