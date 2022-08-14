#include <stdio.h>

int main(void)
{
    int a, b;
    int i;
    
    printf("정수 2개 입력: ");
    scanf("%d %d", &a, &b);
    
    if (a > b)
    {
        for (i = a; i > 0; i--)
            if (a % i == 0 & b % i == 0)
                break;
    }
    else
    {
        for (i = b; i > 0; i--)
            if (a % i == 0 & b % i == 0)
                break;
    }
    
    printf("%d와 %d의 최대공약수: %d \n", a, b, i);
    
    return 0;
}