#include <stdio.h>

int main(void)
{
    int input[10] = {0}, ouput[10] = {0};
    int i = 0, k = 0, j = 9;
    printf("총 10개의 숫자 입력 \n");
    for (i=0; i<10; i++)
    {
        printf("입력: ");
        scanf("%d", &input[i]);

        if (input[i] % 2 == 1)
            ouput[k++] = input[i];
        else
            ouput[j--] = input[i];
    }

    printf("배열 요소의 출력 : ");
    for (i=0; i<10; i++)
        printf("%d ", ouput[i]);
    
    return 0;
}