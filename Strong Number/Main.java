#include <stdio.h>
int main() {
	int n,fact=1,a,c,s=0;
  	scanf("%d",&n);
  	int t=n;
  	while(n>0)
    {
      	a=n%10;
      	fact=1;
      	for (c = 1; c <= a; c++)
        {
          	fact = fact * c;
        }
      	s=s+fact;
      	n=n/10;
    }
    if(s==t)
    {
      	printf("Yes");
    }
  	else printf("No");//Type your code
	return 0;
}