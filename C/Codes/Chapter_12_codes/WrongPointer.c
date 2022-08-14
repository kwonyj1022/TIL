#include <stdio.h>
int main(void)
{
    int* ptr1;    // 포인터 변수 ptr은 쓰레기 값으로 초기화 됨
    *ptr1 = 200;
    
    int* ptr2 = 125;    // 125번지가 어딘 줄 알고?
    *ptr2 = 10;

    return 0;
}