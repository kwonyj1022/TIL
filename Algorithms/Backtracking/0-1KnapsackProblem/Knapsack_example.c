#include <stdio.h>
#define true 1
#define false 0
#define N 4     // item 개수
#define W 16    // 배낭 무게
int p[N + 1] = { 0, 40, 30, 50, 10 };
int w[N + 1] = { 0, 2, 5, 10, 5 };

int maxprofit;
int numbest;
char bestset[N + 1];
char include[N + 1];

int promising(int i, int weight, int profit);
void knapsack(int i, int profit, int weight);

int main(void) {
    knapsack(0, 0, 0);
    printf("[bestset]\n");
    for (int i = 1; i <= N; i++) {
        printf("item%d  ", i);
    }
    printf("\n");

    for (int i = 1; i <= N; i++) {
        if (bestset[i] == 'O')
            printf("  yes  ");
        else
            printf("  no   ");
    }
}

void knapsack(int i, int profit, int weight) {
    if ((weight <= W) && (profit > maxprofit)) {
        maxprofit = profit;
        numbest = i;
        for (int i = 1; i <= N; i++) {
            bestset[i] = include[i];
        }
    }
    if (promising(i, weight, profit)) {
        include[i + 1] = 'O';
        knapsack(i + 1, profit + p[i + 1], weight + w[i + 1]);
        include[i + 1] = 'X';
        knapsack(i + 1, profit, weight);
    }
}
int promising(int i, int weight, int profit) {
    int j, k;
    int totweight;
    float bound;

    if (weight >= W)
        return false;
    else {
        j = i + 1;
        bound = profit;
        totweight = weight;
        while ((j <= N) && (totweight + w[j] <= W)) {
            totweight = totweight + w[j];
            bound = bound + p[j];
            j++;
        }
        k = j;
        if (k <= N)
            bound = bound + (W - totweight) * (p[k] / w[k]);

        return bound > maxprofit;
    }
}