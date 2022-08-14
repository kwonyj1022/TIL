#include <stdio.h>
int main(void)
{
    int korean, english, math;
    double average;
    char score;
    
    printf("국어, 영어, 수학 점수 입력: ");
    scanf("%d %d %d", &korean, &english, &math);
    
    average = (korean + english + math) / 3.0;
    
    if (average >= 90.0)
        score = 'A';
    else if (average >= 80.0)
        score = 'B';
    else if (average >= 70.0)
        score = 'C';
    else if (average >= 50.0)
        score = 'D';
    else
        score = 'F';
    
    printf("평균: %f \n", average);
    printf("학점: %c \n", score);
    
    return 0;
}