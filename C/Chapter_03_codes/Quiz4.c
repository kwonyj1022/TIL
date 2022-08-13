#include <stdio.h>
int main(void)
{
    int num1, num2;
    printf("정수 2개 입력: ");
    scanf("%d %d", &num1, &num2);
    printf("몫: %d \n", num1/num2);
    printf("나머지: %d \n", num%num2);
    
    return 0;
}