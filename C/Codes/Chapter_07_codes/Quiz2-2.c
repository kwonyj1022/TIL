#include <stdio.h>
int main(void)
{
    int n = 0, i = 0;
    
    while(n < 5)
    {
        while(i < n)
        {
            printf("ㅇ");
            i++;
        }
        
        i = 0;
        printf("* \n");
        n++;
    }
    
    return 0;
}