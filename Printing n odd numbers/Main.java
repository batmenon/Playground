#include <stdio.h>
int main() {
	int n;
  	scanf("%d",&n);
  	int count =1 ;
  	for(int i=1;i<=n;i++)
    {
      	printf("%d\n",count);
      	count=count+2;
    }
  
	return 0;
}