#include <stdio.h>
int main(void)
{
    int age = 12;
    printf("제 나이는 10진수로 %d살, 16진수로 %X살입니다. \n", age, age);
    /* %d는 10진수 정수 출력을, %x는 16진수 정수이면서 알파벳은 대문자로 출력을 의미
    %x는 대소문자 다 쓸 수 있고 X가 대문자면 알파벳이 대문자로, x가 소문자면 알파벳이 소문자로 출력됨 */
    return 0;
}