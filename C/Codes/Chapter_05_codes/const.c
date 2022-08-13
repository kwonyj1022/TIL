#include <stdio.h>
int main(void)
{
    const int MAX = 100;      // MAX는 상수이므로 값 변경 불가
    const double PI = 3.14    // PI는 상수이므로 값 변경 불가
    ····
    const int MAX;    // 쓰레기 값(의미없는 값)으로 초기화 되어버림
    MAX = 150    // 값 변경 불가하므로 컴파일 에러 발생
    ····
}