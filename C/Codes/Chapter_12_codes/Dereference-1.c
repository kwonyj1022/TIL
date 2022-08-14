#include <stdio.h>
int main(void)
{
    int num = 10;
    int* pnum = &num;       // 포인터 변수 pnum이 변수 num을 가리키게 하는 문장
    *pnum = 20;             // pnum이 가리키는 변수에 20을 저장하라!
    printf("%d", *pnum);    // pnum이 가리키는 변수를 부호 있는 정수로 출력하라!
    return 0;
}