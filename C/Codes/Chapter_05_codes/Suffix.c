#include <stdio.h>
int main(void)
{
    float num = 5.789;     //경고 메시지 발생
    float num = 5.789f;    // 경고 메시지 발생 안 함
    float num = 5.789F;    // 접미사는 대소문자 구분 안 함
    
    return 0;
}