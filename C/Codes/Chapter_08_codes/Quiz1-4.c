#include <stdio.h>
int main(void)
{
    int num1, num2, result;
    printf("정수 2개 입력: ");
    scanf("%d %d", &num1, &num2);
    
    result = (num1>num2) ? (num1-num2) : (num2-num1);
    
    printf("결과: %d \n", result);
    
    return 0;
}