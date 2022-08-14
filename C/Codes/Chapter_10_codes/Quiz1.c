#include <stdio.h>

int main(void)
{
    int num;
    printf("정수 입력: ");
    scanf("%d", &num);
    printf("16진수로: %x", num);
    return 0;
}