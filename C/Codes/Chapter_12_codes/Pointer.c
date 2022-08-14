#include <stdio.h>
int main(void)
{
    int num = 7;
    int* pnum;      // 포인터 변수 pnum의 선언
    pnum = &num;    // num의 주소 값을 포인터 변수 pnum에 저장
    return 0;
}