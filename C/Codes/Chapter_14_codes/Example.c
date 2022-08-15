#include <stdio.h>

void ShowArrElem(int *param, int len)
{
    int i;
    for (i=0; i<len; i++)
        printf("%d ", param[i]);
    printf("\n");
}

void AddArrElem(int param[], int len, int add)
{
    int i;
    for (i=0; i<len; i++)
        param[i] += add;
}

// 배열을 인자로 받을 때 int* param 과 int param[] 둘 다 사용 (동일)

int main(void)
{
    int arr[3] = {1, 2, 3};
    ShowArrElem(arr, sizeof(arr)/sizeof(int));

    AddArrElem(arr, sizeof(arr)/sizeof(int), 1);
    ShowArrElem(arr, sizeof(arr)/sizeof(int));

    AddArrElem(arr, sizeof(arr)/sizeof(int),5);
    ShowArrElem(arr, sizeof(arr)/sizeof(int));

    return 0;
}