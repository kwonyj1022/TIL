#include <stdio.h>
int main(void)
{
    int num=20;
    const int *ptr = &num;
    *ptr = 30;    // 컴파일 에러
    num = 40;     // 컴파일 성공
    
    return 0;
}