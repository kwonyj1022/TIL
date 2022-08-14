#include <stdio.h>
int main(void)
{
    int num1, num2;
    printf("정수 2개 입력: ");
    scanf("%d %d", &num1, &num2);
    
    if (num1 >num2)
        printf("결과: %d \n", num1-num2);
    else
        printf("결과: %d \n", num2-num1);
    
    return 0;
}