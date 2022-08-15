#include <stdio.h>

int main(void)
{
    int score[5][5] = 0;
    int i, j, sum;

    /* 성적 입력 */
    printf("[성적 입력] \n");
    for (i=0; i<4; i++)
    {
        for (j=0; j<4; j++)
        {
            printf("%d번 학생 과목%d 성적: ", i+1, j+1);
            scanf("%d", &score[i][j]);
        }
    }
    printf("\n");

    /* 개인별 총점 */
    for (i=0; i<4; i++)
        for (j=0; j<4; j++)
            score[i][4] += score[i][j];
    
    /* 과목별 총점 */
    for (j=0; j<4; j++)
        for (i=0; i<4; i++)
            score[4][j] += score[i][j];
    
    /* 총점 */
    for (i=0; i<4; i++)
        score[4][4] += score[i][4];
    
    /* 저장된 값 출력 */
    for (i=0; i<5; i++)
    {
        for (j=0; j<5; j++)
            printf("%d ", score[i][j]);
        printf("\n");
    }

    return 0;
}