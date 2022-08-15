#include <stdio.h>

int main(void)
{
    int num = 0;
    int bin[30] = {0};
    int i = 0;
    printf("10진수 정수 입력: ");
    scanf_s("%d", &num);
    
    for (i=0; ; i++)
    {
        if (num == 0)
        {
            printf("0000\n");
            return 0;
        }
        else if (num == 1)
        {
            printf("0001\n");
            return 0;
        }
        else
        {
            bin[i] = num % 2;
            num /= 2;
            if (num == 1)
            {
                bin[++i] = 1;
                break;
            }
        }
    }

    printf("2진수:");
    i = 4*(i/4 + 1) - 1;
    for (; i>=0; i--)
    {
        if (i%4 == 3)
            printf(" ");
        printf("%d", bin[i]);
    }

    return 0;
}