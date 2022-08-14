#include <stdio.h>

int main(void)
{
    int bread, snack, coke;
    
    printf("현재 당신이 소유하고 있는 금액: 3500 \n");
    
    for (bread = 7; bread > 0; bread--)
        for (snack = 5; snack > 0; snack--)
            for (coke = 8; coke > 0; coke--)
                if (bread * 500 + snack * 700 + coke * 400 == 3500)
                    printf("크림빵 %d개, 새우깡 %d개, 콜라 %d개 \n", bread, snack, coke);
                    
    printf("어떻게 구입하시겠습니까? \n");
    
    return 0;
}