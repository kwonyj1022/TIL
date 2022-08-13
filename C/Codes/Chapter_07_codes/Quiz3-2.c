#include <stdio.h>
int main(void)
{
    int num = 0, result = 0;
    
    do
    {
        result += num;
        num += 2;
    }while(num <= 100);
    
    printf("결과: %d \n", result);
    
    return 0;
}