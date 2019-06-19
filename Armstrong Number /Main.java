#include <stdio.h>
int main() {
	int n;
  	scanf("%d",&n);
  	int t=n;
  	int r,s=0;
  	while(n!=0)
    {
      	r=n%10;
      	s=s+pow(r,3);
      	n=n/10;
    }
  	if(s==t)
    {
		printf("\Armstrong Number");
    }
    else printf("Not an Armstrong Number");  	//Type your code
	return 0;
}