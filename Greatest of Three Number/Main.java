#include <stdio.h>

int main()
{ 
  long a,b,c;
  scanf("%ld, %ld, %ld",&a,&b,&c);
  if(a>b&&a>c)
    printf("%ld",a);
   else if(b>c&&b>a)
    printf("%ld",b);
   else if(c>a&&c>b)
    printf("%ld",c);
  else
    printf("invalid output");
  return 0;
}