/* 유클리드 호제법 */
#include <iostream>
using namespace std;

int GCD(int a, int b)
{   // 유클리드 호제법으로 a와 b의 최대공약수 구하기
    if (a < b)
    {   // a >= b가 되도록 수 바꾸기
        int temp = a;
        a = b;
        b = temp;
    }
    
    int r = a % b;
    if (r == 0)
        return b;
    else
        return GCD(b, r);
}