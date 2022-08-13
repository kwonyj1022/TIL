#include <stdio.h>
int main(void)
{
    int num = 1;    // 0이 아닌 수로만 초기화하면 됨
    int result = 0;
    
    while(num != 0)
    {
        printf("정수 입력: ");
        scanf("%d", &num);
        result += num;
    }
    
    printf("입력된 모든 정수의 합: %d \n", result);
    
    return 0;
}