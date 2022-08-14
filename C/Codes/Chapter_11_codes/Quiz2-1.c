#include <stdio.h>

int main(void)
{
    char str[100];
    int strLen = 0, i = 0;

    printf("영단어 1개 입력: ");
    scanf("%s", str);

    for (i = 0; str[i] != '\0'; i++)
        strLen += 1;

    printf("영단어 길이: %d \n", strLen);

    return 0;
}