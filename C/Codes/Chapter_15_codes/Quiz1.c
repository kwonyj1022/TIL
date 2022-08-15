#include <stdio.h>

void odd(int arr[])
{
    int i=0;
    printf("홀수 출력: ");

    for(i=0; i<10; i++)
    {
        if(arr[i] % 2 == 1)
        {
            printf("%d", arr[i]);
            if(i != 9)
                printf(", ");
        }
    }
    printf("\n");
}

void even(int arr[])
{
    int i=0;
    printf("짝수 출력: ");

    for(i=0; i<10; i++)
    {
        if(arr[i] % 2 == 0)
        {
            printf("%d ", arr[i]);
            if(i != 9)
                printf(", ");
        }
    }    
    printf("\n");
}

int main(void)
{
    int nums[10] = {0};
    int i=0;

    printf("총 10개의 숫자 입력 \n");
    for(i=0; i<10; i++)
    {
        printf("입력: ");
        scanf("%d", &nums[i]);
    }
    
    odd(nums);
    even(nums);

    return 0;
}