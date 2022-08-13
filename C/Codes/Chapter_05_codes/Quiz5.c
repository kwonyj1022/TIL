#include <stdio.h>
int main(void)
{
    char ch;
    printf("알파벳 문자 하나 입력: ");
    scanf("%c" &ch);
    
    printf("아스키코드 값: %d \n", ch);
    
    return 0;
}