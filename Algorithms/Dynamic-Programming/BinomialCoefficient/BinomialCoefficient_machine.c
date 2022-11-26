#include <stdio.h>
#define N 6
#define K 3
void machine(int n, int k);
int printProcess(int n, int k);

int main(void) {
    machine(N, K);
}

void machine(int n, int k) {
    printf("\n 따라서 %dC%d = %d\n", N, K, printProcess(N, K));
}
int printProcess(int n, int k) {
    printf("bin(%d, %d) = ", n, k);
    if (k == 0 || n == k) {
        printf("%d\n\n", 1);
        return 1;
    }
    else {
        printf("bin(%d, %d) + bin(%d, %d)\n\n", n - 1, k - 1, n - 1, k);
        return printProcess(n - 1, k - 1) + printProcess(n - 1, k);
    }
}