#include <stdio.h>

/* 포인터 변수에 저장된 값의 변경이 목적이므로 포인터 변수의 주소값을 함수에 전달해야 함 */
void SwapIntPtr(int **dp1, int **dp2)
{
    int *temp = *dp1;    // int *temp = ptr1; 와 동일
    *dp1 = *dp2;         // ptr1 = ptr2; 와 동일
    *dp2 = temp;         // ptr2 = temp; 와 동일
}

int main(void)
{
    int num1 = 10, num2 = 20;
    int *ptr1 = &num1, *ptr2 = &num2;
    printf("*ptr1  *ptr2 : %d  %d \n", *ptr1, *ptr2);

    SwapIntPtr(&ptr1, &ptr2);    // ptr1과 ptr2의 주소값 전달
    printf("*ptr1  *ptr2 : %d  %d \n", *ptr1, *ptr2);
}