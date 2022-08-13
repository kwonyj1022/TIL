#include <stdio.h>
int main(void)
{
    int total = 0;
    int i, num;
    
    printf("0부터 어디까지 더할까요? ");
    scanf("%d", &num);
    
    for(i = 0; i <= num; i++)
        total += i;
        
    printf("0부터 %d까지 더한 결과: %d \n", num, total);
    
    return 0;
}