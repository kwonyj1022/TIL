#include <stdio.h>
int main(void)
{
    int n, i;
    int result = 1;
    
    printf("몇 팩토리얼을 구할까요? ");
    scanf("%d", &n);
    
    for(i=1 ; i <= n ; i++)
        result *= i;
    
    printf("&d! = %d \n", n, result);
    
    return 0;
}