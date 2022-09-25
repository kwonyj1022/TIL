/* 선택 정렬 (Selection sort) */
#include <iostream>

void swap(int &a, int &b)
{   // a와 b에 저장된 값을 교환하는 함수
    int tmp = a;
    a = b;
    b = tmp;
}

void SelectionSort(int* a, const int n)
{   // n개의 정수 a[0]부터 a[n-1]까지 오름차순으로 정렬하는 함수
    for (int i = 0; i < n; i++){
        int j = i;
        // a[i]와 a[n-1] 사이에 가장 작은 정수 찾기
        for (int k = i + 1; k < n; k++)
            if (a[k] < a[j])
                j = k;
        // a[j]가 가장 작은 값이므로 a[i]와 바꿈
        swap(a[i], a[j]);
    }
}