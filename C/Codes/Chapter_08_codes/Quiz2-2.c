#include <stdio.h>
int main(void)
{
    int A, Z;
    
    for(A=0 ; A<10 ; A++)
    {
        for(Z=0 ; Z<10 ; Z++)
        {
            if ((10*A + Z + 10*Z + A) != 99)
                continue;
                
            printf("A = %d, Z= %d \n", A, Z);
        }
    }
    
    return 0;
}