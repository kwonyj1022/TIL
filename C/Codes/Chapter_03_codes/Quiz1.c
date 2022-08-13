#include <stdio.h>
int main(void)
{
    int num1, num2;
    printf("정수 2개 입력: ");
    scanf("%d %d", &num1, &num2);
    printf("뺄셈: %d \n", num1-num2);
    printf("곱셈: %d \n", num1*num2);
    
    return 0;
}