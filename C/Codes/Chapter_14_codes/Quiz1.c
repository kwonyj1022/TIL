#include <stdio.h>

int SquareByValue(int n)
{
    return n*n;
}

int SquareByReference(int *n)
{
    *n *= *n;
}

int main(void)
{
    int num;
    printf("제곱할 정수 입력: ");
    scanf("%d", &num);

    printf("Call-by-value 기반: %d \n", SquareByValue(num));

    SquareByReference(&num);
    printf("Call-by-reference 기반: %d \n", num);

    return 0;
}