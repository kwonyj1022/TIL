#include <stdio.h>
int main(void)
{
    int num1, num2;
    scanf("%d %d", &num1, &num2);
    if(num1>num2)
    {
        printf("num1이 num2보다 큽니다. \n");
        printf("%d > %d \n", num1, num2);
    }
}