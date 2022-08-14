#include <stdio.h>

int main(void)
{
    int arr[6] = {1, 2, 3, 4, 5, 6};
    int *fp = &arr[0];
    int *bp = &arr[5];
    int i, temp;

    for (i=0; i<3; i++)
    {
        temp = *fp;
        *fp = *bp;
        *bp; = temp;
        fp++;
        bp--;
    }

    for (i=0; i<6; i++)
        printf("%d ", arr[i]);
    
    return 0;
}