#include <stdio.h>
int main(void)
{
    int num;
    int i = 1;
    
    printf("양의 정수 하나 입력: ");
    scanf("%d", &num);
    
    while(i<=num)
    {
        printf("%d ", 3*i);
        i++;
    }
    
    return 0;
}