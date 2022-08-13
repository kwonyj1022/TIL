#include <stdio.h>
int main(void)
{
    int num1 = 7, num2 = 13;
    printf("%o %#o \n", num1, num1);    // 7 07 출력
    printf("%x %#x \n", num2, num2);    // d 0xd 출력
    
    return 0;
}