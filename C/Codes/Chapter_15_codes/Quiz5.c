#include <stdio.h>

void DesSort(int arr[], int len)
{
    int temp, i, j;
    for (i=0; i < len-1; i++)
    {
        for (j=0; j < len-i-1; j++)
        {
            if (arr[j+1] > arr[j])
            {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

int main(void)
{
    int arr[7] = {0};
    int i = 0;
    for (i=0; i<7; i++)
    {
        printf("입력: ");
        scanf_s("%d", &arr[i]);
    }

    DesSort(array, 7);

    for (i=0; i<7; i++)
        printf("%d", arr[i]);
    
    printf("\n");

    return 0;
}