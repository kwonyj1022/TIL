#include <stdio.h>

int main(void)
{
    int arr5 = {1, 2, 3, 4, 5};
    int *ptr = &arr[4];
    int i;
    int sum=0;

    for (i=0; i<5; i++)
    {
        sum += *ptr;
        ptr--;
    }

    printf("%d \n", sum);

    return 0;
}