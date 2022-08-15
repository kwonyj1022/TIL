#include <stdio.h>
int main(void)
{
    int arr1[3][4];    // 세로가 3, 가로가 4인 int형 2차원 배열
    int arr2[7][9];    // 세로가 7, 가로가 9인 int형 2차원 배열

    printf("arr1 배열 크기: %d \n", sizeof(arr1));
    printf("arr2 배열 크기: %d \n", sizeof(arr2));

    return 0;
}