#include <stdio.h>
int main() {
	int n;
  	scanf("%d",&n);
  	int l = n%10;
  	while(n>=10)
    {
      	n=n/10;
    }
  	int f=n;
  	printf("%d",l+f);//Type your code
	return 0;
}