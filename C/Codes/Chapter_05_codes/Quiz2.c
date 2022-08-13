#include <stdio.h>
int main(void)
{
    double num1, num2;
    printf("실수 두 개 입력: ");
    scanf("%lf %lf", &num1, &num2);
    
    printf("덧셈: %f \n", num1+num2);
    printf("뺄셈: %f \n", num1-num2);
    printf("곱셈: %f \n", num1*num2);
    printf("나눗셈: %f \n", num1/num2);
    
    return 0;
}