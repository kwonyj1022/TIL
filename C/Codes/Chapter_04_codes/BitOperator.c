#include <stdio.h>
int main(void)
{
    int num1 = 15;    // 00001111
    int num2 = 20;    // 00010100
    int num = -16;    // 11110000
    int num3 = num1 & num2;    // 00000100
    int num4 = num1 | num2;    // 00011111
    int num5 = num1 ^ num2;    // 00011011
    int num6 = ~num1;          // 11110000
    int num7 = num1<<1;        // 00011110
    int num8 = num1<<2;        // 00111100
    int num9 = num1<<3;        // 01111000
    int num10 = num>>2;        // 00111100 또는 11111100
    int num11 = num>>3;        // 00011110 또는 11111110
    
    printf("AND 연산의 결과: %d \n", num3);
    printf("OR 연산의 결과: %d \n", num4);
    printf("XOR 연산의 결과: %d \n", num5);
    printf("NOT 연산의 결과: %d \n", num6);
    printf("1칸 왼쪽 이동 결과: %d \n", num7);
    printf("2칸 왼쪽 이동 결과: %d \n", num8);
    printf("3칸 왼쪽 이동 결과: %d \n", num9);
    printf("2칸 오른쪽 이동 결과: %d \n", num10);
    printf("3칸 오른쪽 이동 결과: %d \n", num11);
    
    return 0;
}