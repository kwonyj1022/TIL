#include <stdio.h>
int main(void)
{
    int x1, y1;
    int x2, y2;
    
    printf("좌 상단의 x, y 좌표: ");
    scanf("%d %d", &x1, %y1);
    printf("우 상단의 x, y 좌표: ");
    scanf("%d %d", &x2, &y2);
    
    printf("두 점이 이루는 직사각형의 넓이는 %d입니다.\n", (x2-x1)*(y2-y1));
    
    return 0;
}