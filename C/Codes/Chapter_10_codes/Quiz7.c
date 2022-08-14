#include <stdio.h>
int jagob(int k)
{
    int i;
    int value = 1;
    for (i = 0; i < k; i++)
        value = value * 2;
    return value;
}

int main(void)
{
    int n, k;
    printf("상수 n 입력: ");
    scanf("%d", &n);
    
    for (k = 1; k > 0; k++)
        if (jagob(k) > n)
            break;
            
    printf("공식을 만족하는 k의 최댓값은 %d \n", k-1);
    
    return 0;
}