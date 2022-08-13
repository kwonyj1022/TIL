#include <stdio.h>
int main(void)
{
    int num;
    int i = 0;
    
    printf("양의 정수 하나 입력: ");
    scanf("%d", &num);
    
    while (i<num)
    {
        i++;
        printf("%d", 3*i);
    }
    
    return 0;
}