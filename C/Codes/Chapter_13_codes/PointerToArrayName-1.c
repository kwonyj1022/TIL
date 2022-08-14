#include <stdio.h>
int main(void)
{
    int arr[3] = {1, 2, 3};
    arr[0] += 5;
    arr[1] += 7;
    arr[2] += 9;
    // 위 문장들은 포인터를 대상으로 문장을 구성한 셈

    return 0;
}