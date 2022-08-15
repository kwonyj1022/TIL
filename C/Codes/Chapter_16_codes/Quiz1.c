#include <stdio.h>

int main(void)
{
    int gugudan[3][9];
    int i, j;

    /* 구구단 저장 */
    for (i=0; i<3; i++)
        for (j=0; j<9; j++)
            gugudan[i][j] = (i+2)*(j+1);

    /* 구구단 출력 */
    for (i=0; i<3; i++)
    {
        for (j=0; j<9; j++)
            printf("%d ", gugudan[i][j]);
        printf("\n");
    }

    return 0;
}