#include <stdio.h>
int main(void)
{
    int dan, i;
    
    for(dan=2 ; dan<=9 ; dan++)
    {
        if(dan%2 != 0)
            continue;
            
        for(i=1 ; i<=9 ; i++)
        {
            if (i > dan)
                break;
            printf("%d * %d = %d \n", dan, i, dan*i);
        }
    }
    
    return 0;
}