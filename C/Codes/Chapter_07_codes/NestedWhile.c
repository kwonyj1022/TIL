#include <stdio.h>
int main(void)
{
    int dan = 2;
    int i = 0;
    
    while(dan < 10)    // 2단부터 9단까지 반복
    {
        i = 1;    // 새로운 단의 시작을 위해서
        
        while (i < 10)    // 각 단의 1부터 9의 곱을 표현
        {
            printf("%d * %d = %d \n", dan, i, dan*i);
            i++;
        }
        
        dan++;    // 다음 단으로 넘어가기 위한 증가
    }
    
    return 0;
}