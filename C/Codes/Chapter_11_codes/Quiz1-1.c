#include <stdio.h>

int main(void)
{
    int arr[5];
    int i, big, small, sum;
    
    for(i = 0; i < 5; i++)
    {
        printf("%d번째 입력: ", i+1);
        scanf("%d", &arr[i]);
    }
    
    big = small = sum = arr[0];
    
    for(i = 1; i < 5; i++)
    {
        sum = sum + arr[i];
        if (big < arr[i])
            big = arr[i];
        if (small > arr[i])
            small = arr[i];
    }
    
    printf("최댓값: %d \n", big);
    printf("최솟값: %d \n", small);
    printf("총 합: %d \n", sum);
}