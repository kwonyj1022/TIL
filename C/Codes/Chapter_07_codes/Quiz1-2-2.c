#include <stdio.h>
int main(void)
{
    int num;
    int i = 0;
    
    printf("양의 정수 하나 입력: ");
    scanf("%d", &num);
    
    while(i++<num)    // 비교연산 이후에 i값이 증가함
        printf("%d", 3*i);
    
    return 0;
}