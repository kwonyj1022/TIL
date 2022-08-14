#include <stdio.h>

int main(void)
{
    int *ptr1 = 0x0010;
    double *ptr2 = 0x0010;

    printf("ptr1 & ptr2 = %p & %p \n", ptr1, ptr2);

    printf("ptr1+1 & ptr1+2 = %p & %p \n", ptr1+1, ptr1+2);    // 4 증가 & 8 증가
    printf("ptr2+1 & ptr2+2 = %p & %p \n", ptr2+1, ptr2+2);    // 8 증가 & 16 증가

    ptr1++;    // 4 증가
    ptr2++;    // 8 증가

    printf("ptr1++ & ptr2++ = %p & %p \n", ptr1, ptr2);

    return 0;
}