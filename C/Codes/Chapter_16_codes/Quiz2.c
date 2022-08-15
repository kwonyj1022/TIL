#include <stdio.h>

int main(void)
{
    int arr_A[2][4] = {
        {1, 2, 3, 4},
        {5, 6, 7, 8}
    };

    int i, j;
    int arr_B[4][2];

    for (i=0; i<4; i++)
        for (j=0; j<2; j++)
            arr_B[i][j] = arr_A[j][i];
    
    return 0;
}