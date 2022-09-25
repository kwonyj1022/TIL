#include <iostream>
using namespace std;

void swap(int &a, int &b)
{   // a와 b에 저장된 값을 교환하는 함수
    int tmp = a;
    a = b;
    b = tmp;
}

void Permutations(char *a, const int k, const int m)
{   // a[k], ..., a[m]에 대한 모든 순열 생성
    if (k == m) {
        for (int i = 0; i <= m; i++)
            cout << a[i] << " ";
        cout << "\n";
    }
    else {
        for (int i = k; i <= m; i++){
            swap(a[k], a[i]);
            Permutations(a, k+1, m);
            swap(a[k], a[i]);
        }
    }
}