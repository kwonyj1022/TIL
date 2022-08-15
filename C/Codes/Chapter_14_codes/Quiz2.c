#include <stdio.h>

int Swap3(int *n1, int *n2, int *n3)
{
    int temp = *n1;
    *n1 = *n3;
    *n3 = *n2;
    *n2 = temp;
}

int main(void)
{
    int num1, num2, num3;
    printf("바꿀 정수 3개 입력: ");
    scanf("%d %d %d", &num1, &num2, &num3);

    Swap3(&num1, &num2, &num3);
    printf("%d %d %d \n", num1, num2, num3);

    return 0;
}