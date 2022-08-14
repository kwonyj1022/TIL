#include <stdio.h>
int Fibo(int num1, int num2)
{
    return num1+num2;
}

int main(void)
{
    int repeat, i, c;
    int num1=0, num2=1;
    printf("몇 개의 피보나치 수열을 출력할까요? ");
    scanf("%d", &repeat);
    
    for(i=0 ; i<repeat ; i++)
    {
        if (i==0)
            printf("%d ", num1);
        else if (i==1)
            printf("%d ", num2);
        else
        {
            c = Fibo(num1, num2);
            printf("%d ", c);
            num1 = num2;
            num2 = c;
        }
    }
    
    return 0;
}