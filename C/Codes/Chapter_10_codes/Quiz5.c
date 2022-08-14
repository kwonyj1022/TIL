#include <stdio.h>

int sosu(int num)    // 소수면 0, 소수가 아니면 1을 반환하는 함수 정의
{
    if (num == 2)    // 2는 소수이므로 전달값이 2면 무조건 0 반환
        return 0;
    else
    {
        int i;
        int b = 0;                   // b = 0이고, 소수가 아닌 것으로 판명나면 b = 1이 됨
        for (i = 2; i < num; i++)    // 2이상 전달값 이하의 수로 나눠서 나누어떨어지면 소수 아님
        {
            if (num % i == 0)    // 1과 자기자신 이외의 수로 나누어 떨어지면 b = 1이 되고 반복문 탈출
            {
                b = 1;
                break;
            }
            else
                continue;
        }

        if (b == 0)    // b = 0이면 소수이고 b = 1이면 소수 아님
            return 0;
        else
            return 1;

    }
}

int main(void)
{
    int num;
    int b = 0;
    for (num = 2; num < 100; num++)    // 2 이상의 수를 함수 sosu에 전달
        if (sosu(num) == 0)    // sosu 함수의 반환값이 0이면, 즉 전달인자가 소수이면 b가 1씩 증가
        {
            b += 1;
            if (b <= 5)        // b <= 5이면 num 출력 (소수 5개 출력해야 하므로)
                printf("%d \n", num);
            else
                break;
        }
    return 0;
}