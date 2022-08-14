#include <stdio.h>

int main(void)
{
    char str[100];
    int big, i;
    
    printf("영단어 입력: ");
    scanf("%s", str);
    
    big = str[0];
    for (i = 1; i<100; i++)
        if (str[i] > big)
            big = str[i];
    
    printf("아스키 코드 값이 가장 큰 문자: %c \n", big);
    
    return 0;
}