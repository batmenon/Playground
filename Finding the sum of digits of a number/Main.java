#include <stdio.h>
int main() {
	int n,r,s=0;
  	scanf("%d",&n);
  	int t=n;
  	while(t!=0)
    {
      	r=t%10;
      	s=s+r;
      	t=t/10;//Type your code
    }
  	printf("%d",s);
	return 0;
}