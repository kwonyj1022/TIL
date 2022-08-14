#include <stdio.h>

int main(void)
{
    int second;
    int h, m, s;
    printf("초(second) 입력: ");
    scanf("%d", &second);
    
    h = second / 3600;
    m = (second % 3600) / 60;
    s = second % 60;
    
    printf("[h: %d, m: %d, s: %d]", h, m, s);
    
    return 0;
}