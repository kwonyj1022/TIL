#include <stdio.h>
int main(void)
{
    int num;
    printf("정수 입력: ");
    scanf("%d", &num);
    num = (~num)+1;
    printf("부호 바꾼 결과: %d \n", num);
    
    return 0;
}