#include<stdio.h>

int main()
{
    

    long a, b, c;

  
    scanf("%ld%ld%ld", &a, &b, &c);  

  
    if(a >= b && a >= c)
    {
        if(b >= c)
        {
            printf("%ld", b);
        }
        else
        {
            printf("%ld", c);
        }
    }
    else if(b >= a && b >= c)
    {
        if(a >= c)
        {
            printf("%ld",a);
        }
        else
        {
            printf("%ld",c);
        }
    }

   
    else if(a >= b)
    {
        printf("%ld", a);
    }
    else
    {
        printf("%ld ", b);
    }

   
    return 0;
}