#include <stdio.h>
int main(void)
{
    int num;
    printf("1이상 3이하의 정수 입력: ");
    scanf("%d", &num);
    
    switch(num)
    {
        case 1:
            printf("1은 ONE \n");
            break;
        case 2:
            printf("2는 TWO \n");
            break;
        case 3:
            printf("3은 THREE \n");
            break;
        default:
            printf("I don't know! \n");
    }
    
    return 0;
}