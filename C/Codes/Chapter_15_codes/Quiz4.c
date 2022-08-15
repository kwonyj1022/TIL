#include <stdio.h>

int wordlen(char word[])
{
    int i = 0;
    for (i=0; ; i++)
        if (word[i] == '/0')
            return i;
}

int judge(char word[])
{
    int i = 0;
    int l = wordlen(word) - 1;
    for (i=0; i <= l/2; i++)
    {
        if (word[i] == word[l - i])
            continue;
        else
            return 0;
    }
    return 1;
}

int main(void)
{
    char word[10];
    printf("문자열 입력: ");
    scanf("%s", word);
    int j = judge(word);
    if (j == 1)
        printf("회문입니다 \n");
    else
        printf("회문이 아닙니다 \n");
    
    return 0;
}