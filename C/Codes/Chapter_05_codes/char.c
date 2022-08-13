#include <stdio.h>
int main(void)
{
    char ch1 = 'A', ch2 = 65;    // 참고로 'A'의 아스키코드는 65임
    int ch3 = 'Z', ch4 = 90;     // 참고로 'Z'의 아스키코드는 90임
    
    printf("%c %d \n", ch1, ch1);    // A 65 출력
    printf("%c %d \n", ch2, ch2);    // A 65 출력
    printf("%c %d \n", ch3, ch3);    // Z 90 출력
    printf("%c %d \n", ch4, ch4);    // Z 90 출력
    
    return 0;
}