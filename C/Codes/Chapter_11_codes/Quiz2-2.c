#include <stdio.h>

int main(void)
{
    char str[100];
    char rts[100];
    int len = 0, i = 0;
    
    printf("영단어 입력: ");
    scanf("%s", str);
    
    while (str[len] != 0)
        len++;
    
    for (i = 0; i < len/2; i++)
    {
        rts[i] = str[len-i];
        rts[len-i] = str[i];
    }
    
    printf("뒤집힌 영단어: %s \n", rts);
    
    return 0;
}