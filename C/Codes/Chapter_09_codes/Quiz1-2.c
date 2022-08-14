#include <stdio.h>
double CelToFah(double Cel)
{
    return 1.8 * Cel + 32;
}

double FahToCel(double Fah)
{
    return (Fah-32)/1.8;
}

int main(void)
{
    int sel;
    int value;
    printf("1. 섭씨 -> 화씨 \n2. 화씨 -> 섭씨 \n");
    printf("선택: ");
    scanf("%d", &sel);
    
    if (sel == 1)
    {
        printf("섭씨 입력: ");
        scanf("%lf", &value);
        printf("화씨: %f \n", CelToFah(value));
    }
    
    else if (sel == 2)
    {
        printf("화씨 입력: ");
        scanf("%lf", &value);
        printf("섭씨: &f \n", FahToCel(value));
    }
    else
        printf("다시 선택하세요 \n"); 
    
    return 0;
}