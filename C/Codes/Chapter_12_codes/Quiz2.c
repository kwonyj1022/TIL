#include <stdio.h>

int main(void)
{
    int num1 = 10, num2 = 20;
    int* ptr1 = &num1;
    int* ptr2 = &num2;
    int* z;
    
    (*ptr1) += 10;
    (*ptr2) -= 10;
    
    z = ptr2;
    ptr2 = ptr1;
    ptr1 = z;
    
    printf("ptr1: %d, ptr2: %d \n", *ptr1, *ptr2);
    
    return 0;
}