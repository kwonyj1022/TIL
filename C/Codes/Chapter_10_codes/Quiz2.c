#include <stdio.h>

void googoodan(int a, int b)
{
    int i, dan;

    if (a < b)
    {
        for (dan = a; dan <= b; dan++)
        {
            printf("\n-------- %d단 --------\n", dan);
            for (i = 1; i <= 9; i++)
                printf("%d * %d = %d \n", dan, i, dan * i);
        }
    }
    else
    {
        for (dan = b; dan <= a; dan++)
        {
            printf("\n-------- %d단 --------\n", dan);
            for (i = 1; i <= 9; i++)
                printf("%d * %d = %d \n", dan, i, dan * i);
        }
    }
}

int main(void)
{
    int a, b;
    printf("정수 2개 입력: ");
    scanf("%d %d", &a, &b);
    googoodan(a, b);
    return 0;
}