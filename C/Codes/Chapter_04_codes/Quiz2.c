#include <stdio.h>
int main(void)
{
    int num = 3;
    num = num<<3;    // 곱하기 8
    num = num>>2;    // 나누기 4
    
    printf("연산 결과: %d \n", num);
    
    return 0;
}