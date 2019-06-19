#include<stdio.h>
int main()
{
  int	n,t1,t2;
  scanf("%d",&n);
  t1=n%10;
  n=n/10;
  t2=n%10;
  printf("%d",t2);//Type your code here
  return 0;
}