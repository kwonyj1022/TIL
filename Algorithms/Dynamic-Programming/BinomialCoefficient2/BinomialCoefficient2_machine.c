#include <stdio.h>
#define N 6
#define K 3
void machine(int n, int k);
void printProcess(int n, int k);
void printB(int B[N + 1][K + 1]);

int main(void) {
    machine(N, K);
}

void printProcess(int n, int k) {
    int i, j;
    int B[N + 1][K + 1] = { 0 };
    for (i = 0; i <= n; i++) {
        int min = (i < k) ? i : k;
        for (j = 0; j <= min; j++) {
            if (j == 0 || j == i) {
                B[i][j] = 1;
                printf("B[%d][%d] = 1\n\n", i, j);
            }
            else {
                B[i][j] = B[i - 1][j - 1] + B[i - 1][j];
                printf("B[%d][%d] = B[%d][%d] + B[%d][%d] = %d\n\n", i, j, i - 1, j - 1, i - 1, j, B[i][j]);
            }
        }
    }
    printf("\n=========================================================\n\n");
    printB(B);
    printf("\n 따라서 %dC%d = %d\n", n, k, B[n][k]);
}

void printB(int B[N + 1][K + 1]) {
    printf(" K\\N  |");
    for (int i = 0; i <= K; i++) {
        printf("%6d", i);
    }
    printf("\n-------------------------------------------\n");
    for (int i = 0; i <= N; i++) {
        printf("  %d   |", i);
        for (int j = 0; j <= K; j++) {
            printf("%6d", B[i][j]);
        }
        printf("\n");
        printf("      |\n");
    }
}

void machine(int n, int k) {
    printProcess(n, k);
}