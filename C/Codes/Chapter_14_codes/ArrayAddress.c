#include <stdio.h>
void SimpleFunc(int *param)
{
    printf("%d %d", param[0], param[1]);    // 첫 번째, 두 번째 요소 출력!
    // 포인터 변수를 이용해서도 배열의 형태로 접근 가능
    return;
}

int main(void)
{
    int arr[3] = {1, 2, 3};
    SimpleFunc(arr);    // 배열이름 arr이 지니는 주소 값 전달
    return 0;
}