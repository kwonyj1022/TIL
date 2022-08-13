#include <stdio.h>
int main(void)
{
    int num;
    int i = 0;
    
    printf("몇 번 반복할까요? ");
    scanf("%d", &num);
    
    while(i < num)
    {
        printf("Hello world! \n");
        i++;
    }
    
    return 0;
}