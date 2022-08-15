#include <stdio.h>

void Swap(int n1, int n2)
{
    int temp = n1;
    n1 = n2;
    n2 = temp;
}

int main(void)
{
    int num1 = 10;
    int num2 = 20;
    printf("num1  num2 : %d  %d \n", num1, num2);

    Swap(num1, num2);
    printf("num1  num2 : %d  %d \n", num1, num2);

    return 0;
}