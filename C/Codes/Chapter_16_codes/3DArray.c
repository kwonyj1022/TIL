#include <stdio.h>

int main(void)
{
    int arr1[2][3][4];    // 높이 2, 세로 3, 가로 4인 int형 3차원 배열
    int arr2[5][5][5];    // 높이, 세로, 가로가 모두 5인 double형 3차원 배열

    printf("높이2, 세로3, 가로4 int형 배열: %d \n", sizeof(arr1));
    printf("높이5, 세로5, 가로5 double형 배열: %d \n", sizeof(arr2));

    return 0;
}