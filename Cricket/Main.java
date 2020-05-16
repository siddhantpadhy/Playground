#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
	int tb,tr,rc,bb;
	cin>>tb;
	cin>>tr;
	cin>>rc;
	cin>>bb;
	double s = double(tr);
	double d = double(rc);
	double OF = (bb/6)+((bb%6)*0.1);
	double CR = rc/OF;
	double TR = (s/(tb/6));
	cout<<tb/6<<"\n";
	cout<<fixed<<setprecision(1)<<OF<<"\n";
  	cout<<fixed<<setprecision(1)<<CR<<"\n";
  	cout<<fixed<<setprecision(1)<<TR<<"\n";
  	if(CR>TR){cout<<"Eligible to Win";}
  	else{cout<<"Not Eligible to Win";}

}