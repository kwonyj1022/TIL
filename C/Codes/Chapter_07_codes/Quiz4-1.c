#include <stdio.h>
int main(void)
{
    int start, end;
    int result = 0;
    
    printf("정수 2개 입력: ");
    scanf("%d %d", &start, &end);
    
    for( ; start <= end ; start++)
        result += start;
    
    printf("결과: %d \n", result);
    
    return 0;
}