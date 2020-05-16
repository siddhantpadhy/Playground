#include<iostream>
using namespace std;
int main()
{
  int q,w,e,r,t,y;
  cout<<"Enter first number : ";
  cin>>q;
  cout<<"Enter second number : ";
  cin>>w;
  cout<<"Menu \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  cin>>e;
  switch(e)
  {
    case 1 :
      cout<<q+w;
      break;
    case 2 :
      cout<<q-w;
      break;
    case 3 :
      cout<<q*w;
      break;
    case 4 :
      cout<<q/w;
      break;
    case 5 :
      cout<<q%w;
      break;
    default:
      cout<<"Invalid operation";}}
      
  
 