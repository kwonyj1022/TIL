#include <stdio.h>

int main(void)
{
    int arr1[3] = {1, 2, 3};
    double arr2[3] = {1.1, 2.2, 3.3};

    printf("%d %g \n", *arr1, *arr2);

    *arr1 += 100;      // 배열 이름을 대상으로 포인터 연산
    *arr2 += 120.5;    // 배열 이름을 대상으로 포인터 연산

    printf("%d %g \n", arr1[0], arr2[0]);

    return 0;
}