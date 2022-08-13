#include <stdio.h>
int main(void)
{
    int num;    // 일부 컴파일러는 초기식 위치에서의 변수선언을 허용하지 않기 때문에 변수 미리 선언
    for(num=0; num<3; num++)
        printf("Hi~ \n");    // 반복의 대상이 한 줄이므로 중괄호 생략 가능
    return 0;
}