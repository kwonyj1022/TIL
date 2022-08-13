#include <stdio.h>
int main(void)
{
    int num1 = 3, num2 = 4;
    double result;
    result = num1 / num2;    // result 값은 0.000000 (0.75 아님)
    
    int num3 = 3, num4 = 4;
    double result;
    result2 = (double)num3 / num4;

    return 0;
}
