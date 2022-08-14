#include <stdio.h>

int main(void)
{
    char arr[ ] = {'G', 'o', 'o', 'd', ' ', 't', 'i', 'm', 'e'};
    int i;
    int arrLen = sizeof(arr) / sizeof(char);
    
    for (i = 0; i < arrLen; i++)
        printf("%c", arr[i]);
    printf("\n");
    
    return 0;
}