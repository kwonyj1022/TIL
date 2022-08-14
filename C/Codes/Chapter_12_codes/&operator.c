#include <stdio.h>
int main(void)
{
    int num = 5;
    int* pnum = &num;    // num의 주소 값을 반환해서 포인터 변수 pnum 초기화
    
    int num1 = 5;
    double* pnum1 = &num1;    // 자료형이 일치하지 않음!
    
    double num2 = 5;
    int* pnum2 = &num2;       // 자료형이 일치하지 않음!
    
    return 0;
}