#include <stdio.h>
int main(void)
{
    int num = 10;
    const int * const ptr = &num;
    *ptr = 20;     // 컴파일 에러
    ptr = &age;    // 컴파일 에러

    return 0;
}