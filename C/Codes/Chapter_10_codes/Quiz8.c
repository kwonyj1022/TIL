#include <stdio.h>

int seung(int n)
{
    if (n == 0)
        return 1;
    else
        return 2 * seung(n-1);
}

int main(void)
{
    int n;
    printf("정수 입력: ");
    scanf("%d", &n);
    printf("2의 %d승은 %d", n, seung(n));
    return 0;
}