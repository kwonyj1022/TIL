#include <stdio.h>
int BigNumber(int num1, int num2, int num3)
{
    if (num1>num2 | num1>num3)
        return num1;
    if else (num2>num1 | num2>num3)
        return num2;
    else
        return num3;
}

int SmallNumber(int num1, int num2, int num3)
{
    if (num1 < num2)
        return (num1 < num3) ? num1 : num3;
    else
        return (num2 < num3) ? num2 : num3;
}

int main(void)
{
    printf("정수 3개 입력: ");
    scanf("%d %d %d", &num1, &num2, &num3);
    printf("가장 큰 수: %d \n", BigNumber(num1, num2, num3));
    printf("가장 작은 수: %d \n", SmallNumber(num1, num2, num3));
    
    return 0;
}