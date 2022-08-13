#include <stdio.h>
int main(void)
{
    int num = 0, i = 0, result = 0;
    
    while(i < 5)
    {
        while(num<1)
        {
            printf("%d 번째 1이상의 정수 입력: ", i+1);
            scanf("%d", &num);
        }
        
        result += num;
        num = 0;
        i++;
    }
    
    printf("결과: %d", result);
    
    return 0;
}