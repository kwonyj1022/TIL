#include <stdio.h>
int main(void)
{
    char num1 = 1, num2 = 2;
    printf("size of num1: %d \n", sizeof(num1));             // 1 출력
    printf("size of char: %d \n", sizeof(char));             // 1 출력
    printf("size of char add: %d \n", sizeof(num1+num2));    // 4 출력
    
    return 0;
}