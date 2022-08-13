#include <stdio.h>
int main(void)
{
    double num1 = 245;    // int형 정수 245를 double형으로 자동 형 변환 (245.000000 저장)

    int num2 = 3.14;      // double형 실수 3.14를 int형으로 자동 형 변환 (소수부분 손실) (3 저장)

    int num3 = 129;
    char ch = num3;       // int형 변수 num3에 저장된 값이 char형으로 자동 형 변환 (상위 바이트 손실)
    /* 129 = 00000000 00000000 00000000 10000001 이고
    1바이트 크기로 줄이면 상위 바이트의 손실이 발생하여 10000001 = -127 */

    return 0;
}
