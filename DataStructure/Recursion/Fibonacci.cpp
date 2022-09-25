/* 피보나치 수 */
#include <iostream>

int Fibonacci(int n)
{   // 피보나치 수 Fn 계산 (F0부터 시작)
    if (n <= 1)
        return n;
    else
        return (Fibonacci(n-1) + Fibonacci(n-2));
}