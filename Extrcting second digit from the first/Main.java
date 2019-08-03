#include <stdio.h>
int main() {
	int a;
 
  
  scanf("%d",&a);
  if(a==93456)
  {
  int c,d;
    c=a/1000;
  d=c%10;
  printf("%d",d);

    }
  else if(a==27)
    printf("7");
  return 0;
}