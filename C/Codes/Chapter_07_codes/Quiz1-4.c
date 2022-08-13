#include <stdio.h>
int main(void)
{
    int num = 0;
    int i = 9;
    
    printf("몇 단 출력? ");
    scanf("%d", &num);
    
    while(i > 0)
    {
        printf("%d * %d = %d \n", num, i, num*i);
        i--;
    }
    
    return 0;
}