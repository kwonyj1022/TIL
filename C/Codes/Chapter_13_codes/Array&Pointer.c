#include <stdio.h>
int main(void)
{
    int *ptr=arr;

    printf("%d %d %d \n", *(ptr+0), *(ptr+1), *(ptr+2));
    printf("%d %d %d \n", , ptr[0], ptr[1], ptr[2]);
    printf("%d %d %d \n", *(arr+0), *(arr+1), *(arr+2));
    printf("%d %d %d \n", arr[0], arr[1], arr[2]);
    
    //위의 네가지 printf 문은 사실상 같은 것이며 동일한 출력 결과를 보임
}
