#include <stdio.h>
int main(void)
{
    int num, input;
    int i = 0, total = 0;
    
    printf("입력할 정수의 개수: ");
    scanf("%d", &num);
    
    while(i < num)
    {
        printf("정수 입력: ");
        scanf("%d", &input);
        total += input;
        i++;
    }
    
    printf("평균: %f \n", (double)total/num);    // 실수값 얻기 위해 형 변환
    
    return 0;
}