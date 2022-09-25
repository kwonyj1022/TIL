#include <iostream>

int BinarySearch(int* a, const int x, const int left, const int right)
{   // 정렬된 배열 a[left], ..., a[right]에서 x 탐색 (몇 번째 인덱스에 있는지 반환)
    if (left <= right){
        int middle = (left + right) / 2;
        if (x < a[middle])
            return BinarySearch(a, x, left, middle - 1);
        else if (x > a[middle])
            return BinarySearch(a, x, middle + 1, right);
        else
            return middle;
    }
    return -1;  // 발견되지 않음
}