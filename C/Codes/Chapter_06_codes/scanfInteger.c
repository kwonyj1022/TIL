#include <stdio.h>
int main(void)
{
    int num1, num2, num3;
    printf("정수 세 개 입력: ");
    scanf("%d %o %x", &num1, &num2, &num3);
    
    printf("입력된 정수 10진수 출력: %d %d %d \n", num1, num2, num3);
    
    return 0;
}