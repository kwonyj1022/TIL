#include <stdio.h>
int main(void)
{
    int num = 0;
    
    while(num<3)
    {
        printf("Hello world! %d \n", num);    // 반복문 안에서도 들여쓰기 함
        num++;    // 이 행이 없으면 무한루프가 만들어짐
    }
    
    return 0;
}